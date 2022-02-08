package com.example.testcode.service;

import com.example.testcode.model.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISysRoleService {
    List<SysRole> findSysRolesBy(String search);
}