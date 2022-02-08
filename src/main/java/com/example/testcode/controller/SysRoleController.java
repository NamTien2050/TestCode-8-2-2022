package com.example.testcode.controller;

import com.example.testcode.model.SysRole;
import com.example.testcode.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/searchRole")
    public ResponseEntity<List<SysRole>> searchRole(@RequestParam(name = "search") String search, Pageable pageable) {
        List<SysRole> searchRole = sysRoleService.findSysRolesBy(search);
        return new ResponseEntity<>(searchRole, HttpStatus.OK);
    }
}
