package com.example.testcode.model.account;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
public class JwtResponse {
    private long id;
    private String token;
    private String type = "Bearer";
    private String userName;
    private Collection<? extends GrantedAuthority> role;

    public JwtResponse(String accessToken, long id, String userName, Collection<? extends GrantedAuthority> role) {
        this.token = accessToken;
        this.id = id;
        this.userName = userName;
        this.role = role;
    }

}
