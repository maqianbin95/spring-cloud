package com.mqb.consumer8088.providerdept.controller;

import com.mqb.consumer8088.providerdept.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/getDept/{id}")
    public Dept get(@PathVariable("id") long id){
        Dept dept =  restTemplate.getForObject(REST_URL_PREFIX+"/getDept/"+id,Dept.class);
        System.out.println(dept+"****deptId***"+dept.getDeptId()+"***name***"+dept.getName());
        return dept;

    }

    @RequestMapping("/consumer/addDept")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/addDept/",dept,boolean.class);
    }
}
