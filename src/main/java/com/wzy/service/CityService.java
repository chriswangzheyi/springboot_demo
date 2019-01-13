package com.wzy.service;

import com.wzy.model.City;

import java.util.List;

public interface CityService {

    City findCityById(Integer id);
    int addCity(City City);
    int deleteCityById(Integer id);
    int update(City city);

}
