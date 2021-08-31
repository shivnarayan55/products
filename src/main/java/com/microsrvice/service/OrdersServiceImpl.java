package com.microsrvice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microsrvice.model.Cart;
import com.microsrvice.model.Orders;
import com.microsrvice.repository.CartRepository;
import com.microsrvice.repository.OrdersRepository;

public class OrdersServiceImpl implements OrdersService {
	
//	@Autowired
//	CartRepository cartRepository;
//	
//	@Autowired
//	OrdersRepository ordersRepository;
//
//	@Override
//	public Orders checkoutByUserId(int userId) {
//		
//		List<Cart> carts = cartRepository.findByUserId(userId);
//		
//		Orders order = new Orders();
//		
//		int totalPrice = 0;
//		
//		for(Cart cart : carts) {
//			totalPrice+= cart.getUnitPrice() * cart.getQuantity();
//			
//		}
//		
//		order.setTotalPrice(totalPrice);
//		order.setUserId(userId);
//		return ordersRepository.save(order);
//		
//		
//	}
	

}
