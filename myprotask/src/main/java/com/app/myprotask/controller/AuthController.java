package com.app.myprotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.app.myprotask.jwt.AuthenticationRequest;
import com.app.myprotask.jwt.AuthenticationResponse;
import com.app.myprotask.jwt.JWTUtil;
import com.app.myprotask.model.User;
import com.app.myprotask.model.repositories.UserRepository;

/**
 * @author Aris
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        User user;
        try {
            System.out.println("Email: " + authenticationRequest.getEmail());
            System.out.println("Password: " + authenticationRequest.getPassword());

            user = userRepository.findByEmail(authenticationRequest.getEmail());
            if (user == null) {
                throw new BadCredentialsException("Incorrect email");
            }

            if (!passwordEncoder.matches(authenticationRequest.getPassword(), user.getPassword())) {
                throw new BadCredentialsException("Incorrect password");
            }

            if (!user.isActive()) {
            	System.out.println("User is inactive");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User is inactive");
            }
            
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect email or password");
        }

        final String jwt = jwtUtil.generateToken(user.getIdUser(), user.getEmail(), user.getRole().getName(), user.getName(), user.getLastName());

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
