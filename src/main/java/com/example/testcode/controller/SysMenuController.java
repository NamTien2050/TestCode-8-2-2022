package com.example.testcode.controller;

import com.example.testcode.model.ResponObj;
import com.example.testcode.model.SysMenu;
import com.example.testcode.model.dto.SysMenuDTO;
import com.example.testcode.service.sysMenu.ISysMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class SysMenuController {
    @Autowired
    private ISysMenuService iSysMenuService;

    @GetMapping("/list-menu")
    public ResponObj getAllBySysMenu(@RequestParam(required = false) String code,
                                     @RequestParam(required = false) String name,
                                     @RequestParam(required = false) String url) {
        List<SysMenuDTO> listSysMenu = iSysMenuService.getAllBySysMenu(code, name, url);
        if (listSysMenu != null)
            return new ResponObj(200, "success", listSysMenu);
        return new ResponObj(207, "IP not found");
    }
    @PostMapping("/save-menu")
    public ResponObj saveSysMenu (@RequestBody SysMenu sysMenu){
        boolean sysMenu1 = iSysMenuService.saveSysMenu(sysMenu);
        if (sysMenu1)
            return new ResponObj(200,"success");
        return new ResponObj(200,"edit success");
    }
    @DeleteMapping("/delete-menu")
    public ResponObj delete(int id) {
        if (iSysMenuService.removeRole(id))
            return new ResponObj(200, "Success");
        return new ResponObj(207, "IP not found");
    }
}
