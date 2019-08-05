package com.mqb.consumerfeign.providerdept.controller;

import com.mqb.consumerfeign.providerdept.entity.Dept;
import com.mqb.consumerfeign.providerdept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeptController_Consumer {

    @Autowired
    private DeptService deptService;


    @ResponseBody
    @RequestMapping(value = "/consumer/getDept/{id}")
    public Dept getDept(@PathVariable("id") Long deptId){
        return deptService.getDeptById(deptId);
    }


}
