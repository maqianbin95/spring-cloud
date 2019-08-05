package com.mqb.provider8002.providerdept.service;


import com.mqb.provider8002.providerdept.entity.Dept;

public interface DeptService {
    public Dept getDeptById(Long deptId);

    Boolean deleteDeptById(Long deptId);
}
