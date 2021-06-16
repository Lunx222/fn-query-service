package com.fin.finqueryservice.Repository;

import com.fin.finqueryservice.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("testRepository")
public interface TestRepository extends JpaRepository<TestEntity, Long> {

    TestEntity save(TestEntity entity);

}
