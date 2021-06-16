package com.fin.finqueryservice.controller.response;

import com.fin.finqueryservice.constants.QueryStatus;
import com.fin.finqueryservice.entity.TestEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResponse {

    private String serialNo;

    private TestEntity entity;

    private QueryStatus qs;

}
