package com.example.testcode.service.account;

import com.example.testcode.model.account.Roles;

import java.util.List;

public interface IRoleService {
    Roles findRoleByName(String roleName);

    List<Roles> findAll();

    void save(Roles role);
}
