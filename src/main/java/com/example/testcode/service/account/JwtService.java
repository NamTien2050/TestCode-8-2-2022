package com.example.testcode.service.account;


import com.example.testcode.model.account.UserPrinciple;
import io.jsonwebtoken.*;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.logging.Logger;

import static jdk.internal.org.jline.utils.Log.error;
@Component
public class JwtService {
    private static final String SECRET_KEY = "111";
    private static final Long EXPIRE_TIME = 86400000000L;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(JwtService.class.getName());

    public String generateTokenLogin(Authentication authentication) {

        UserPrinciple userPrincipal = (UserPrinciple) authentication.getPrincipal();


        return Jwts.builder()

                .setSubject((userPrincipal.getUsername()))

                .setIssuedAt(new Date())

                .setExpiration(new Date((new Date()).getTime() + EXPIRE_TIME * 1000))

                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)

                .compact();

    }


    public boolean validateJwtToken(String authToken) {

        try {

            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(authToken);

            return true;

        } catch (SignatureException e) {

            error("Invalid JWT signature -> Message: {} ", e);

        } catch (MalformedJwtException e) {

            error("Invalid JWT token -> Message: {}", e);

        } catch (ExpiredJwtException e) {

            error("Expired JWT token -> Message: {}", e);

        } catch (UnsupportedJwtException e) {

            error("Unsupported JWT token -> Message: {}", e);

        } catch (IllegalArgumentException e) {

            error("JWT claims string is empty -> Message: {}", e);

        }
        return false;
    }


    public String getUserNameFromJwtToken(String token) {
        String userName = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody().getSubject();
        return userName;
    }

}
