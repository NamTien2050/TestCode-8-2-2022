package com.example.testcode.service.sysMenu;

import com.example.testcode.model.ResponseMenuRole;
import com.example.testcode.model.dto.SysMenuDTO;

import java.util.List;

public interface ISysMenuService {
    List<ResponseMenuRole> getSysMenu(int roleId);

}
