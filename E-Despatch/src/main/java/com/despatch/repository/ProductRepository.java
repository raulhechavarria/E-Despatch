package com.despatch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	public List<Product> findByName(String foo);


}
