package com.wzy.serviceImpl;

import com.wzy.dao.CityMapper;
import com.wzy.model.City;
import com.wzy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;


    @Override
    public City findCityById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addCity(City City) {
        return cityMapper.insert(City);
    }

    @Override
    public int deleteCityById(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(City City) {
        return cityMapper.updateByPrimaryKey(City);
    }




}
