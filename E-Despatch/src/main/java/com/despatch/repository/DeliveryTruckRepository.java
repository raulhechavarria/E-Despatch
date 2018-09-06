package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.company.Broker;
import com.despatch.entity.company.DeliveryTruck;

@Repository
public interface DeliveryTruckRepository extends CrudRepository<DeliveryTruck, Long>{

}
