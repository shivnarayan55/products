package com.microsrvice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.microsrvice.model.OrderData;
@Repository
public interface OrderDataRepository extends JpaRepository<OrderData, Integer> {

	List<OrderData> findByUserId(int userId);

	Object deleteByProductId(int productId);

	Object deleteByUsername(String username);

	OrderData findByProductId(int id);
	
	

	

}
