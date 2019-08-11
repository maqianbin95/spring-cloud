package com.mqb.hystrix8001.providerdept.controller;

import com.mqb.hystrix8001.providerdept.entity.Dept;
import com.mqb.hystrix8001.providerdept.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class DeptController {

    private static final Logger log = LoggerFactory.getLogger(DeptController.class);

    @Resource
    private DeptService deptService;


    @RequestMapping("/getDept/{id}")
    @HystrixCommand(fallbackMethod = "processHytrixGet")
    public Dept getDept(@PathVariable("id") Long deptId){

        Dept dept =  deptService.getDeptById(deptId);
        if(dept == null){
            throw new RuntimeException("该ID:"+deptId+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHytrixGet(@PathVariable("id") Long deptId){

        return new Dept().setDeptId(deptId)
                .setName("该ID"+deptId+"没有对应信息").setDbSource("no db in mysql");
    }
}
