package com.microsrvice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsrvice.model.OrderData;
import com.microsrvice.repository.OrderDataRepository;

@Service
public class OrderDataServiceImpl implements OrderDataService {
	
	@Autowired
	OrderDataRepository orderDataRepository;

	

	@Override
	public List<OrderData> viewAllItemsInOrderData(int userId) {
		// TODO Auto-generated method stub
		return orderDataRepository.findByUserId(userId);
	}



	@Override
	public Object deleteByProductId(int productId) {
		return orderDataRepository.deleteByProductId(productId);
		
	}



	@Override
	public Object deleteByUsername(String username) {
		// TODO Auto-generated method stub
		return orderDataRepository.deleteByUsername(username);
	}


   

}
