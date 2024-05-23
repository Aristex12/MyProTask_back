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
            // Log del email y la contraseña antes de la autenticación
            System.out.println("Email: " + authenticationRequest.getEmail());
            System.out.println("Password: " + authenticationRequest.getPassword());

            // Busca el usuario por email
            user = userRepository.findByEmail(authenticationRequest.getEmail());
            if (user == null) {
                System.out.println("User not found");
                throw new BadCredentialsException("Incorrect email or password");
            }

            System.out.println("Encoded password from DB: " + user.getPassword());
            if (!passwordEncoder.matches(authenticationRequest.getPassword(), user.getPassword())) {
                System.out.println("Provided password: " + authenticationRequest.getPassword());
                System.out.println("Password does not match");
                throw new BadCredentialsException("Incorrect email or password");
            }

            // Autentica al usuario
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect email or password");
        }

        // Genera el token JWT
        final String jwt = jwtUtil.generateToken(user.getEmail());

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
