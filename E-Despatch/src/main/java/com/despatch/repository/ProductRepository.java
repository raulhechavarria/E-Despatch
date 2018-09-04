package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
