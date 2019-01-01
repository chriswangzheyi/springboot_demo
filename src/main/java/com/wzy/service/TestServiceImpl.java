package com.wzy.service;

import com.wzy.dao.TestDao;
import com.wzy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Test> findAll() {
        return testDao.findAll();
    }

    @Override
    public Test findById(String objectid) {
        return testDao.findById(objectid);
    }

    @Override
    public void save(Test test) {
        testDao.saveTest(test);
    }

    @Override
    public void delete(Query query) {
        testDao.deleteBy(query);
    }

    @Override
    public void update(Query query, Update update) {
        testDao.updateBy(query, update);
    }
}
