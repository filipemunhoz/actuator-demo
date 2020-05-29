package com.actuator.actuatordemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.actuator.actuatordemo.model.DistributionList;

@Repository
public interface DistributionRepository extends CrudRepository<DistributionList, Long>{

}

