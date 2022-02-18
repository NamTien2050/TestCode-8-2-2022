package com.example.testcode.model.account;

import com.example.testcode.model.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {
    private int id;
    private String userName;
    private String passWord;
    private Collection<? extends GrantedAuthority> sysRole;

    public UserPrinciple(int id,
                         String userName, String passWord,
                         Collection<? extends GrantedAuthority> sysRole) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.sysRole = sysRole;
    }

    public static UserDetails build(SysUser sysUser) {
        List<GrantedAuthority> authorities = sysUser.getRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getName())
        ).collect(Collectors.toList());

        return new UserPrinciple(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                authorities
        );
    }

    public int getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return sysRole;
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
