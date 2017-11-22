package com.goule666.himmaForDnf.dao;

import com.goule666.himmaForDnf.model.domain.WorkerTypeDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

/**
 * @author niewenlong
 */
@Component
public interface WorkerTypeRepository extends JpaRepository<WorkerTypeDO, Integer> {

    WorkerTypeDO findByCode(@Param("code")String code);

}
