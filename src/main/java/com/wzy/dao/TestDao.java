package com.wzy.dao;

import com.wzy.model.Test;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface TestDao {
    List<Test> findAll();

    Test findById(String objectid);

    void saveTest(Test test);

    void deleteBy(Query query);

    void updateBy(Query query, Update update);

}
