package com.example.testcode.service.sysRole;

import com.example.testcode.model.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISysRoleService {
    List<SysRole> findSysRolesBy(String search);

    List<SysRole> getAll();

    void saveRole(SysRole role);

    boolean removeRole(int roleId);

    SysRole findById(int roleId);

    void editRole(SysRole sysRole);
}
