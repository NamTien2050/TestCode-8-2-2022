package com.example.testcode.model.dto;

import lombok.Data;

@Data
public class SysMenuDTO {
    int sysMenuId;
    Integer parentId;
    String code;
    String name;
    Integer sortOrder;
}
