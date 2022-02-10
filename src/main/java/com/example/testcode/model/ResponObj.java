package com.example.testcode.model;

import lombok.*;

@Getter
@Setter
public class ResponObj extends ResponSaveRole {
    private Object data;

    public ResponObj(int code, String desc, Object data) {
        super(code, desc);
        this.data = data;
    }
}
