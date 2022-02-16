package com.example.testcode.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "domain_data")
public class DomainData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domain_data_id")
    private int domainDataId;
    @Column(name = "data_id")
    private int dataId;
    @Column(name = "data_code")
    private String dataCode;
    @Column(name = "data_name")
    private String dataName;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "path")
    private String path;
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "status")
    private int status;
    @Column(name = "domain_type_id")
    private int domainTypeId;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "path_level")
    private int pathLevel;
    @Column(name = "is_active")
    private int isActive;
    @Column(name = "icon_path")
    private String iconPath;
    @Column(name = "game_service_group_id")
    private int gameServiceGroupId;
}
