package com.fin.finqueryservice.service.impl;

import com.fin.finqueryservice.Repository.TestRepository;
import com.fin.finqueryservice.entity.TestEntity;
import com.fin.finqueryservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource(name = "testRepository")
    private TestRepository repository;

    @Override
    public TestEntity saveTestObj(TestEntity entity) {
        return repository.save(entity);
    }

    @Override
    public String checkStatus(String message) {
        if(message.equals("hi")){
            return "alive!";
        }
        else
            return "how dare u?!";
    }
}
