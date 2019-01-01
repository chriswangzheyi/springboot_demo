package com.wzy.service;

import com.wzy.model.Test;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface TestService {

    List<Test> findAll();

    Test findById(String objectid);

    void save(Test test);

    void delete(Query query);

    void update(Query query, Update update);
}
