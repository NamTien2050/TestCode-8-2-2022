package com.example.testcode.model.account;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {
    private long id;
    private String userName;
    private String passWord;
    private Collection<? extends GrantedAuthority> role;

    public UserPrinciple(long id,
                         String userName, String passWord,
                         Collection<? extends GrantedAuthority> sysRole) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.role = sysRole;
    }

    public static UserDetails build(Users users) {
        List<GrantedAuthority> authorities = users.getRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getRoleName())
        ).collect(Collectors.toList());

        return new UserPrinciple(
                users.getId(),
                users.getUserName(),
                users.getPassword(),
                authorities
        );
    }

    public long getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
