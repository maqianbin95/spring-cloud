package com.mqb.provider8001.providerdept.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Dept {
    private Long deptId;
    private String name;
    private String dbSource;
}