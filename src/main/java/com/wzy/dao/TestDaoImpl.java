package com.wzy.dao;


import com.wzy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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

    @Override
    public void deleteBy(Query query) {
        mongoTemplate.remove(query,Test.class);
    }

    @Override
    public void updateBy(Query query, Update update) {
        /*更新第一个*/
        mongoTemplate.updateFirst(query,update,Test.class);
        /*更新多个*/
        /*mongoTemplate.updateMulti(query,update,Test.class);*/
    }


}
