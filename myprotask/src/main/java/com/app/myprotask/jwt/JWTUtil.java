package com.app.myprotask.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {

    @Autowired
    private JwtProperties jwtProperties;

    public String generateToken(Long userId, String email, String role, String firstName, String lastName) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(jwtProperties.getSecret());
            return JWT.create()
            		.withClaim("userId", userId)
                    .withSubject(email)
                    .withClaim("firstName", firstName)
                    .withClaim("lastName", lastName)
                    .withClaim("role", role)
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(System.currentTimeMillis() + jwtProperties.getExpiration()))
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Error creating JWT token", exception);
        }
    }

    public String extractEmail(String token) {
        return decodeJWT(token).getSubject();
    }

    public Long extractUserId(String token) {
        return decodeJWT(token).getClaim("userId").asLong();
    }

    public String extractRole(String token) {
        return decodeJWT(token).getClaim("role").asString();
    }

    public String extractFirstName(String token) {
        return decodeJWT(token).getClaim("firstName").asString();
    }

    public String extractLastName(String token) {
        return decodeJWT(token).getClaim("lastName").asString();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        String email = extractEmail(token);
        return (email.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return decodeJWT(token).getExpiresAt().before(new Date());
    }

    private DecodedJWT decodeJWT(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(jwtProperties.getSecret());
            JWTVerifier verifier = JWT.require(algorithm).build();
            return verifier.verify(token);
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("Error verifying JWT token", exception);
        }
    }
}
