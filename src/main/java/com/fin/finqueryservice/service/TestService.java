package com.fin.finqueryservice.service;

import com.fin.finqueryservice.entity.TestEntity;
import org.springframework.stereotype.Service;


public interface TestService {
    TestEntity saveTestObj(TestEntity entity);

    String checkStatus(String message);
}
