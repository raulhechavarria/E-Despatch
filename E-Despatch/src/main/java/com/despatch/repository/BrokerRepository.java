package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.company.Broker;

@Repository
public interface BrokerRepository extends CrudRepository<Broker, Long>{

}
