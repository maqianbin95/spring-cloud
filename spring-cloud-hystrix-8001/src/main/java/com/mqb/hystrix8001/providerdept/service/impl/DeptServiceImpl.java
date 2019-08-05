package com.mqb.hystrix8001.providerdept.service.impl;

import com.mqb.hystrix8001.providerdept.entity.Dept;
import com.mqb.hystrix8001.providerdept.mapper.DeptMapper;
import com.mqb.hystrix8001.providerdept.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Long deptId) {
        return deptMapper.selectByPrimaryKey(deptId);
    }
    @Override
    public Boolean deleteDeptById(Long deptId) {

        return deptMapper.deleteByPrimaryKey(deptId) == 0?false:true;
    }
}
