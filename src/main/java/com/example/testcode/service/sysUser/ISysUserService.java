package com.example.testcode.service.sysUser;

import com.example.testcode.model.SysUser;

public interface ISysUserService {
    void save(SysUser sysUser);

    Iterable<SysUser> findAll();
}

