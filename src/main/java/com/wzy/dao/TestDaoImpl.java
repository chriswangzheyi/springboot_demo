package com.wzy.dao;


import com.wzy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
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

    @Override
    public Test findById(String objectid) {
        return mongoTemplate.findById(objectid, Test.class);
    }

    @Override
    public void saveTest(Test test) {
        mongoTemplate.save(test);
    }



}
