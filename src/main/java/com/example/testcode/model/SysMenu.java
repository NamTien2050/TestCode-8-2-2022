package com.example.testcode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sys_menu_id")
    private int sysMenuId;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @Column(name = "sort_order")
    private Integer sortOrder;
    @Column(name = "path")
    private String path;
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "application_id")
    private Integer applicationId;
    @Column(name = "new_id")
    private Integer newId;
    @Column(name = "status")
    private Integer status;
    @Column(name = "resource_key")
    private Integer resourceKey;
    @Column(name = "menu_css")
    private String menuCss;
}
