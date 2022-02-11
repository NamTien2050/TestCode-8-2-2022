package com.example.testcode.model.dto;

import com.example.testcode.model.ResponSaveRole;
import lombok.NoArgsConstructor;


public class SysMenuDTO extends ResponSaveRole {
    int sysMenuId;
    int parentId;
    String codes;
    String name;
    int sortOrder;

    public SysMenuDTO(int code, String desc) {
        super(code, desc);

    }

    public SysMenuDTO(int code, int sysMenuId, int parentId, String codes, String name, int sortOrder, String desc) {
        super(code, desc);
        this.sysMenuId = sysMenuId;
        this.parentId = parentId;
        this.codes = codes;
        this.name = name;
        this.sortOrder = sortOrder;
    }
}
