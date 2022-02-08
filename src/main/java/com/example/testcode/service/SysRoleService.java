package com.example.testcode.service;

import com.example.testcode.model.SysRole;
import com.example.testcode.repository.ISysRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleService implements ISysRoleService {
    @Autowired
    private ISysRoleRepo iSysRoleRepo;

    @Override
    public List<SysRole> findSysRolesBy(String search) {
        return iSysRoleRepo.findSysRolesBy(search);
    }
}
