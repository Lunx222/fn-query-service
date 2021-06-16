package com.fin.finqueryservice.entity;

import com.fin.finqueryservice.constants.TestStatus;
import com.fin.finqueryservice.vo.TestVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_test")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Date createTime = new Date();

    private Date updateTime = new Date();

    @Column(name = "test_status")
    private TestStatus status = TestStatus.STATUS_1;

}
