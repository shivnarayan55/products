package com.microsrvice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.microsrvice.model.OrdersMongo;
import com.microsrvice.repository.OrdersMongoRepository;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class OrdersMongoController {

	@Autowired
	OrdersMongoRepository ordersMongoRepository;
	
	
	@PostMapping("/checkout")
	public String checkoutByUserId( @RequestBody OrdersMongo orders) {
		

		 
		 
		  ordersMongoRepository.save(orders);
		  return "orders saved";
		 
	}
	
	@GetMapping("/viewAllOrder") 
	public List<OrdersMongo> viewAllOrders() {
		return ordersMongoRepository.findAll();
	}
}
