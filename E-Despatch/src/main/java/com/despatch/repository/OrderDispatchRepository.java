package com.despatch.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.despatch.entity.OrderDispatch;

@Repository
public interface OrderDispatchRepository extends CrudRepository<OrderDispatch, Long> {

	@Query("SELECT o FROM OrderDispatch o where o.orderDispatchNumber = :orderNumber")
	OrderDispatch findOrderDispatchByOrderDispatchNumber(@Param("orderNumber") String orderNumber);
}
