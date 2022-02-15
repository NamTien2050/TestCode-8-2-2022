package com.example.testcode.service.sysMenu;

import com.example.testcode.model.SysMenu;
import com.example.testcode.model.dto.SysMenuDTO;

import java.util.List;

public interface ISysMenuService {
    List<SysMenuDTO> getAllBySysMenu(String code, String name, String url);

    SysMenu findById(int id);

    Boolean saveSysMenu(SysMenu sysMenu);

    boolean removeRole(int roleId);

}
