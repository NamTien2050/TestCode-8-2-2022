package com.example.testcode.service.sysUser;

import com.example.testcode.model.SysUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ISysUserService extends UserDetailsService {
    void save(SysUser sysUser);

    Iterable<SysUser> findAll();
}
