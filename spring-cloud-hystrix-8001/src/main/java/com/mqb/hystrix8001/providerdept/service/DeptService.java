package com.mqb.hystrix8001.providerdept.service;


import com.mqb.hystrix8001.providerdept.entity.Dept;

public interface DeptService {
    public Dept getDeptById(Long deptId);

    Boolean deleteDeptById(Long deptId);
}
