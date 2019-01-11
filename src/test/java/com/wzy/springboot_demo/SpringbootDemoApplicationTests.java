package com.wzy.springboot_demo;

import com.wzy.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {


    @Autowired
    RedisService redisService;

    @Test
    public void contextLoads() {

        redisService.set("aa","aa");

        System.out.println("============================================================="+redisService.get("aa"));
    }

}

