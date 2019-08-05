package com.mqb.hystrix8001.providerdept.entity;

import lombok.Data;

@Data
public class Dept {
    private Long deptId;
    private String name;
    private String dbSource;

    public Long getDeptId() {
        return deptId;
    }

    public Dept setDeptId(Long deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dept setName(String name) {
        this.name = name;
        return this;
    }

    public String getDbSource() {
        return dbSource;
    }

    public Dept setDbSource(String dbSource) {
        this.dbSource = dbSource;
        return this;
    }
}