package com.example.testcode.model;

import lombok.*;

@Getter
@Setter
public class ResponObj {
    private Object data;
    private int code;
    private String desc;

    public ResponObj(int code, String desc, Object data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public ResponObj(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
