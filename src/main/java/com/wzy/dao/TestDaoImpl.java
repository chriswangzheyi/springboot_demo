package com.wzy.dao;


import com.wzy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TestDao")
public class TestDaoImpl implements TestDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Test> findAll() {
        return mongoTemplate.findAll(Test.class);
    }
}
