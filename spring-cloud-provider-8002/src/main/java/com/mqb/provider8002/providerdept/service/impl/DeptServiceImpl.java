package com.mqb.provider8002.providerdept.service.impl;

import com.mqb.provider8002.providerdept.entity.Dept;
import com.mqb.provider8002.providerdept.mapper.DeptMapper;
import com.mqb.provider8002.providerdept.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Long deptId) {
        System.out.println(deptId);
        Dept dept = new Dept();
        dept=deptMapper.selectByPrimaryKey(deptId);
        System.out.println(dept);
        return dept;
    }

    @Override
    public Boolean deleteDeptById(Long deptId) {
        return deptMapper.deleteByPrimaryKey(deptId) == 0?false:true;
    }
}
