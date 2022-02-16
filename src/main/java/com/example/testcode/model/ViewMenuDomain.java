package com.example.testcode.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_menu_domain")
@Data
public class ViewMenuDomain {
    @Id
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "domain_data_id")
    private int domainDataId;
    @Column(name = "data_code")
    private String dataCode;
    @Column(name = "data_name")
    private String dataName;
}
