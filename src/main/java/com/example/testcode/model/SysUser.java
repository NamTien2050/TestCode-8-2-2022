package com.example.testcode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sys_user")
public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sys_user_id")
    private int sysUserId;
    @Column(name = "login_name")
    private String loginName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "password")
    private String password;
    @Column(name = "employee_code")
    private String employeeCode;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "status")
    private int status;
    @Column(name = "new_id")
    private int newId;
    @Column(name = "change_password_date")
    private String ChangePasswordDate;
    @Column(name = "need_change_password")
    private int needChangePassword;
    @Column(name = "num_of_login")
    private int numOfLogin;
    @Column(name = "lastest_login_time")
    private String latestLoginTime;
    @Column(name = "ip_address")
    private String idAddress;
    @Column(name = "sessionid")
    private String sessionId;
    @Column(name = "user_agent")
    private String userAgent;
}
