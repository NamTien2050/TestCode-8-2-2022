package com.example.testcode.service.sysUser;

import com.example.testcode.model.SysUser;
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface ISysUserService {
    void save(SysUser sysUser);

    Iterable<SysUser> findAll();
}

//extends UserDetailsService