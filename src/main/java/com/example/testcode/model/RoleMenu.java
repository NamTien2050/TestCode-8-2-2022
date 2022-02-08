package com.example.testcode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "role_menu")
public class RoleMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_menu_id")
    private int roleMenuID;
    @Column(name = "sys_menu_id")
    private int sysMenuId;
    @Column(name = "sys_role_id")
    private int sysRoleID;
    @Column(name = "is_active")
    private int isActive;
}
