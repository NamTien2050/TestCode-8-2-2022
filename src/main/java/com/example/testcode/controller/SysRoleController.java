package com.example.testcode.controller;

import com.example.testcode.model.*;
import com.example.testcode.model.dto.SysMenuDTO;
import com.example.testcode.model.dto.response.SysMenuResponse;
import com.example.testcode.service.SysRoleService;
import com.example.testcode.service.sysMenu.SysMenuService;
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
    @Autowired
    private SysMenuService sysMenuService;


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

    @GetMapping("/menu-of-role")
    public ResponseEntity<?> getSysMenu(@RequestParam(name = "roleId") int roleId) {
//        List<SysMenu> searchRoleCode = sysMenuService.getSysMenu(search);
//        if (searchRoleCode != null) {
//            return new SysMenuDTO(200, searchRoleCode.get(Integer.parseInt(search)).getSysMenuId(),
//                    searchRoleCode.get(Integer.parseInt(search)).getParentId(),
//                    searchRoleCode.get(Integer.parseInt(search)).getCode(),
//                    searchRoleCode.get(Integer.parseInt(search)).getName(),
//                    searchRoleCode.get(Integer.parseInt(search)).getSortOrder(),
//                    "success"
//            );
//        }
//        return new SysMenuDTO(207, "IP không hợp lệ");
//    }
        List<ResponseMenuRole> searchh= sysMenuService.getSysMenu(roleId);
        System.out.println(searchh);
        if (searchh != null) {
           ResponObj responObj = new ResponObj(200,"abc",searchh);
           return new ResponseEntity<>(responObj,HttpStatus.OK);
        }
        return null;
    }
}
