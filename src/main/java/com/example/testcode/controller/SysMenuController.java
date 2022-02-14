package com.example.testcode.controller;

import com.example.testcode.model.ResponObj;
import com.example.testcode.model.dto.SysMenuDTO;
import com.example.testcode.service.DTOService.SysMenuDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class SysMenuController {
    @Autowired
    private SysMenuDTOService sysMenuDTOService;
    @GetMapping("/list-menu")
    public ResponObj getAllMenu(@RequestParam(name = "searchCode") String code) {
//        Boolean listSysMenu= sysMenuDTOService.getAllByCodes(code);
        if(listSysMenu)
            return new ResponObj(200,"success",listSysMenu);
        return new ResponObj(207,"IP not found");
    }
}
