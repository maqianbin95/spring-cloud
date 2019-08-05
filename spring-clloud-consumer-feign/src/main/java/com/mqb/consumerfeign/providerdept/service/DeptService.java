package com.mqb.consumerfeign.providerdept.service;


import com.mqb.consumerfeign.providerdept.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PROVIDER-HYSTRIX")
public interface DeptService {
    @RequestMapping(value = "/getDept/{id}")
    public Dept getDeptById(@PathVariable("id")Long deptId);

}
