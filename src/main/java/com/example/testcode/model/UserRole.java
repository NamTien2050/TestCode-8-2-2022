package com.example.testcode.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "user_role")
public class UserRole {
    @Id
    @Column(name = "user_role_id")
    private int userRoleId;
    @Column(name = "sys_user_id")
    private int sysUserId;
    @Column(name = "sys_role_id")
    private int sysRoleId;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "created_by")
    private String createBy;
    @Column(name = "is_active")
    private int isActive;
}
