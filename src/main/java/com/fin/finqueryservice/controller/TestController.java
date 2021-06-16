package com.fin.finqueryservice.controller;

import com.fin.finqueryservice.constants.QueryStatus;
import com.fin.finqueryservice.controller.request.TestRequest;
import com.fin.finqueryservice.controller.response.TestResponse;
import com.fin.finqueryservice.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Resource(name = "testService")
    private TestService testService;

    @PostMapping("/add")
    public TestResponse saveTest(@RequestBody TestRequest request) {
        TestResponse response = new TestResponse();
        response.setSerialNo(request.getSerialNo());
        response.setQs(QueryStatus.SUCCESS);
        response.setEntity(testService.saveTestObj(request.getEntity()));
        return response;
    }

    @GetMapping("/riddle/")
    public String hello(@RequestParam String message){
        return testService.checkStatus(message);
    }

}
