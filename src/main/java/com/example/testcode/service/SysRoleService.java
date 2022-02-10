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

    @Override
    public List<SysRole> getAll() {
        return iSysRoleRepo.getAll();
    }

    @Override
    public void saveRole(SysRole role) {
        iSysRoleRepo.save(role);
    }

    @Override
    public boolean removeRole(int roleID) {
        SysRole old = findById(roleID);
        if (old != null) {
            iSysRoleRepo.deleteById(roleID);
            return true;
        }
        return false;

    }

    @Override
    public SysRole findById(int roleId) {
        return iSysRoleRepo.findById(roleId).get();
    }

    @Override
    public void editRole(SysRole editRole) {
        SysRole old = findById(editRole.getId());
        old.setName(editRole.getName());
        old.setCode(editRole.getCode());
        old.setDescription(editRole.getDescription());
        old.setNewId(editRole.getNewId());
        iSysRoleRepo.save(old);
    }

}
