package com.example.testcode.service.account;

import com.example.testcode.model.account.Roles;
import com.example.testcode.repository.account.IRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepo iRoleRepo;

    @Override
    public Roles findRoleByName(String roleName) {
        return iRoleRepo.findByUserName(roleName);
    }

    @Override
    public List<Roles> findAll() {
        return iRoleRepo.findAll();
    }

    @Override
    public void save(Roles role) {
        iRoleRepo.save(role);
    }
}
