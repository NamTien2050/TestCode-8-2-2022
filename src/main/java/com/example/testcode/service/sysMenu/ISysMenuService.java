package com.example.testcode.service.sysMenu;

import com.example.testcode.model.ResponseMenuRole;

import java.util.List;

public interface ISysMenuService {
    List<ResponseMenuRole> getSysMenu(int roleId);
}
