package com.example.testcode.service.viewMenuRole;

import com.example.testcode.model.ViewMenuRole;

import java.util.List;

public interface IViewMenuRoleService {
    List<ViewMenuRole> getSysMenu(int roleId);
}
