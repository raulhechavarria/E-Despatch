package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.company.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
