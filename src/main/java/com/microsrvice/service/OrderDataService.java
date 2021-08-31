package com.microsrvice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microsrvice.model.OrderData;

@Service
public interface OrderDataService {

	

	List<OrderData> viewAllItemsInOrderData(int userId);

	Object deleteByProductId(int productId);

	Object deleteByUsername(String username);

	

}
