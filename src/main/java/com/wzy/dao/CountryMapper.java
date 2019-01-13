package com.wzy.dao;

import com.wzy.model.Country;
import org.springframework.stereotype.Repository;

@Repository("country")
public interface CountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}