package com.mqb.consumer8088.providerdept.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Dept {
    private Long deptId;
    private String name;
    private String dbSource;
}