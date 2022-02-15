package com.example.testcode.controller;

import com.example.testcode.model.*;
import com.example.testcode.service.resMenuRole.IResMenuRoleService;
import com.example.testcode.service.sysRole.ISysRoleService;
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
    private ISysRoleService isysRoleService;
    @Autowired
    private IResMenuRoleService iResMenuRoleService;


    @GetMapping("/search-role")
    public ResponseEntity<List<SysRole>> searchRole(@RequestParam(name = "search") String search, Pageable pageable) {
        List<SysRole> searchRole = isysRoleService.findSysRolesBy(search);
        return new ResponseEntity<>(searchRole, HttpStatus.OK);
    }

    @GetMapping("/list-all-role")
    public ResponObj getAll() {
        List<SysRole> getAllRole = isysRoleService.getAll();
        if (getAllRole.size() == 0) {
            return new ResponObj(200, "empty data", getAllRole);
        }
        return new ResponObj(200, "Successful", getAllRole);
    }

    @PostMapping("/save-role")
    public ResponObj saveRole(@RequestBody SysRole sysRole) {
        if (isysRoleService.findById(sysRole.getId()) == null) {
            isysRoleService.saveRole(sysRole);
            return new ResponObj(200, "success");
        }
        isysRoleService.editRole(sysRole);
        return new ResponObj(200, "success");
    }

    @DeleteMapping("/delete-role")
    public ResponObj delete(int roleId) {
        if (isysRoleService.removeRole(roleId))
            return new ResponObj(200, "Success");
        return new ResponObj(207, "IP not found");
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
        List<ResponseMenuRole> searchh = iResMenuRoleService.getSysMenu(roleId);
        System.out.println(searchh);
        if (searchh != null) {
            ResponObj responObj = new ResponObj(200, "abc", searchh);
            return new ResponseEntity<>(responObj, HttpStatus.OK);
        }
        return null;
    }

}
