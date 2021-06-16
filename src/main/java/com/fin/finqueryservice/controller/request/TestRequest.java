package com.fin.finqueryservice.controller.request;

import com.fin.finqueryservice.entity.TestEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestRequest {

    private String serialNo;

    private TestEntity entity;
}
