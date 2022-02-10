package com.example.testcode.service.sysMenu;

import com.example.testcode.model.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuService implements ISysMenuService {
    @Autowired
    private ISysMenuService iSysMenuService;

    @Override
    public List<SysMenu> getSysMenu(String searchRoleId) {
        return iSysMenuService.getSysMenu(searchRoleId);
    }
}
