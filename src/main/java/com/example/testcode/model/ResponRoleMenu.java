package com.example.testcode.model;

public class ResponRoleMenu extends ResponSaveRole {
    private int sysMenuId;
    private int parentId;
    private String code;
    private String name;
    private int sortOrder;
    public ResponRoleMenu(int code, String desc) {
        super(code, desc);
    }
}
