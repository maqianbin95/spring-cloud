package com.mqb.provider8002.providerdept.controller;

import com.mqb.provider8002.providerdept.entity.Dept;
import com.mqb.provider8002.providerdept.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class DeptController {

    private static final Logger log = LoggerFactory.getLogger(DeptController.class);

    @Resource
    private DeptService deptService;


    @RequestMapping("/getDept/{id}")
    @ResponseBody
    public Dept getDept(@PathVariable("id") Long deptId){
        System.out.println("***8002***"+deptId);
        Dept dept = deptService.getDeptById(deptId);
        System.out.println("***8002***"+dept);
        return dept;
    }


    @RequestMapping("/deleteDept/{id}")
    @ResponseBody
    public boolean deleteDept(@PathVariable("id") Long deptId){
        System.out.println(deptId);
        return deptService.deleteDeptById(deptId);
    }
}
