package com.example.testcode.service.DTOService;

import com.example.testcode.model.SysMenu;

import java.util.List;

public interface ISysMenuDTOService {
     List<SysMenu> getAllByCodes(String code);
}
