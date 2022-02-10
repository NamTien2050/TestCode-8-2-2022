package com.example.testcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
public class ResponSaveRole {
    private int code;
    private String desc;
}
