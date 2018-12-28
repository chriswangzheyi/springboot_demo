package com.wzy.controller;

import com.wzy.model.Test;
import com.wzy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    /*返查询全部Collection*/
    @RequestMapping("/findAll")
    public List<Test> findAll(){
     return  testService.findAll();
    }

    /*根据id查询*/
    @RequestMapping("/find/{objectid}")
    public Test findById(@PathVariable String objectid){
        return testService.findById(objectid);
    }

    /*新增Collection*/
    @RequestMapping("/save")
    public void save(){
        Test test = new Test();
        test.setNum(1);
        test.setTitle("11");
        testService.save(test);
    }



}
