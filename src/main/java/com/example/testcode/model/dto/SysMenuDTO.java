package com.example.testcode.model.dto;

import com.example.testcode.model.ResponSaveRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data

public class SysMenuDTO {

    int sysMenuId;

    int parentId;

    String codes;

    String name;
    int sortOrder;

}
