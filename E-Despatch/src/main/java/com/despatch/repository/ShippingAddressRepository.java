package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.ShippingAddress;

@Repository
public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long>{

}
