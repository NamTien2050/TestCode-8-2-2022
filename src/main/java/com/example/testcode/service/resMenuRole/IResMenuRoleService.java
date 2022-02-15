package com.example.testcode.service.resMenuRole;

import com.example.testcode.model.ResponseMenuRole;

import java.util.List;

public interface IResMenuRoleService {
    List<ResponseMenuRole> getSysMenu(int roleId);
}
