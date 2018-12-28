package com.wzy.controller;

import com.wzy.model.Test;
import com.wzy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> findAll(){
        System.out.println(testService.findAll());
     return  testService.findAll();
    }

}
