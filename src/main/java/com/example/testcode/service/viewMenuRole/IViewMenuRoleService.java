package com.example.testcode.service.viewMenuRole;

import com.example.testcode.model.ViewMenuRole;
import com.example.testcode.model.dto.SysMenuDTO;

import java.util.List;

public interface IViewMenuRoleService {
    List<SysMenuDTO> getSysMenuRole(int roleId);
}
