package com.example.testcode.service.sysMenu;

import com.example.testcode.model.SysMenu;

import java.util.List;

public interface ISysMenuService {
List<SysMenu> getSysMenu(String searchRoleId);
}
