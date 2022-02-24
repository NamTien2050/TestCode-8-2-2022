package com.example.testcode.controller;

import com.example.testcode.config.SecurityConfig;
import com.example.testcode.model.account.JwtResponse;
import com.example.testcode.model.account.Users;
import com.example.testcode.service.account.IUserService;
import com.example.testcode.service.account.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class LoginController {
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private IUserService iUserService;

    @PostMapping("/loginTicket")
    public ResponseEntity<?> Login(@RequestBody Users users) {
        try {
            Authentication authentication = securityConfig.authenticationManager().authenticate(
                    new UsernamePasswordAuthenticationToken(users.getUserName(), users.getPassword())
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtService.generateTokenLogin(authentication);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Users currentUsers = iUserService.findByUserName(users.getUserName());
            return ResponseEntity.ok(new JwtResponse(jwt, currentUsers.getId(), userDetails.getUsername(), userDetails.getAuthorities()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
