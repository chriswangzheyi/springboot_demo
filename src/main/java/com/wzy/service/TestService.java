package com.wzy.service;

import com.wzy.model.Test;

import java.util.List;

public interface TestService {

    List<Test> findAll();

    Test findById(String objectid);

    void save(Test test);
}
