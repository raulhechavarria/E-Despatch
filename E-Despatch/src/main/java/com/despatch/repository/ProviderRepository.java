package com.despatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.despatch.entity.company.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long>{

}
