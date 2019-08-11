package springcloudribbon.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloudribbon.demo.entity.Dept;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8002";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consume/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"depy/add/",dept,Boolean.class);
    }

}
