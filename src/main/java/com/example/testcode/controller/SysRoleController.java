package com.example.testcode.controller;

import com.example.testcode.model.ResponObj;
import com.example.testcode.model.ResponSaveRole;
import com.example.testcode.model.SysRole;
import com.example.testcode.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/search-role")
    public ResponseEntity<List<SysRole>> searchRole(@RequestParam(name = "search") String search, Pageable pageable) {
        List<SysRole> searchRole = sysRoleService.findSysRolesBy(search);
        return new ResponseEntity<>(searchRole, HttpStatus.OK);
    }

    @GetMapping("/list-all-role")
    public ResponObj getAll() {
        List<SysRole> getAllRole = sysRoleService.getAll();
        if (getAllRole.size() == 0) {
            return new ResponObj(200, "empty data", getAllRole);
        }
        return new ResponObj(200, "Successful", getAllRole);
    }

    @PostMapping("/save-role")
    public ResponSaveRole saveRole(@RequestBody SysRole sysRole) {
        if (sysRoleService.findById(sysRole.getId()) == null) {
            sysRoleService.saveRole(sysRole);
            return new ResponSaveRole(200, "success");
        }
        sysRoleService.editRole(sysRole);
        return new ResponSaveRole(200, "success");
    }

    @DeleteMapping("/delete-role")
    public ResponSaveRole delete(int roleId) {
        if (sysRoleService.removeRole(roleId))
            return new ResponSaveRole(200, "Success");
        return new ResponSaveRole(207, "IP not found");
    }
}
