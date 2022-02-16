package com.example.testcode.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ViewMenuDomainDTO {
    int domainDataId;
    String dataCode;
    String dataName;
}
