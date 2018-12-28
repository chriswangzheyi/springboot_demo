package com.wzy.dao;

import com.wzy.model.Test;

import java.util.List;

public interface TestDao {
    List<Test> findAll();

    Test findById(String objectid);

    void saveTest(Test test);


}
