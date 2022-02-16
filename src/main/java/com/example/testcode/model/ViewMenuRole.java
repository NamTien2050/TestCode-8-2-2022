package com.example.testcode.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_menu_role")
@Data
public class ViewMenuRole {
    @Id
    @Column(name = "sys_role_id")
    private int sysRoleId;
    @Column(name = "sys_menu_id")
    private int sysMenuId;
    @Column(name = "code")
    private String codes;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "sort_order")
    private int sortOrder;
}
