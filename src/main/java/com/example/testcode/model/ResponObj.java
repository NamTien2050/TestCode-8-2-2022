package com.example.testcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponRole {
    public int success = 200;
    public int fail = 207;
    private int code;
    private Object data;
    private String desc;
}
