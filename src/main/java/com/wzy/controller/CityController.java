package com.wzy.controller;

import com.wzy.model.City;
import com.wzy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping("/find/{id}")
    public City findCityById(@PathVariable int id){
        return cityService.findCityById(id);
    }

}
