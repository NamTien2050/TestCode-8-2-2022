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
    private int id;

    @Column(name = "parent_id")
    private int parentId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @Column(name = "sort_order")
    private int sortOrder;
    @Column(name = "path")
    private String path;
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "application_id")
    private int applicationId;
    @Column(name = "new_id")
    private int newId;
    @Column(name = "status")
    private int status;
    @Column(name = "resource_key")
    private int resourceKey;
    @Column(name = "menu_css")
    private String menuCss;
}
