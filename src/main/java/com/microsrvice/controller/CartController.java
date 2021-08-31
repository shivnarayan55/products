package com.microsrvice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsrvice.model.Cart;
import com.microsrvice.model.OrderData;
import com.microsrvice.model.Orders;
import com.microsrvice.repository.CartRepository;
import com.microsrvice.repository.OrderDataRepository;
import com.microsrvice.repository.OrdersRepository;
import com.microsrvice.service.CartService;
import com.microsrvice.service.OrderDataService;
import com.microsrvice.service.OrdersService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cart")

public class CartController {
	
	@Autowired
	CartService cartService;
//	
	@Autowired
	OrderDataService orderDataService;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	OrderDataRepository orderDataRepository;
	

	
	@GetMapping("/{userId}")
	public List<Cart> viewCartByUserId(@PathVariable int userId) {
		
		return cartService.viewCartByUserId(userId);
		
		
		
		
	}
	
	@GetMapping("/viewAllItemsInCart") 
	public List<Cart> viewAllItemsInCart() {
		return cartService.viewAllItemsInCart();
	}
	
	
	@Transactional
	@PostMapping("/add")
	public Cart addToCart(@RequestBody Cart cart) {
		
		return cartService.addToCart(cart);
	}
	@Transactional
	@DeleteMapping("/{userId}")
	public Cart deleteFromCartById(@PathVariable int userId) {
		
		return cartService.deleteFromCartById(userId);
	}
	
	@Transactional
	@DeleteMapping("/deleteByProductId/{productId}")
	public Cart deleteFromCartByProductId(@PathVariable int productId) {
		
		return cartService.deleteFromCartByProductId(productId);
	}
	
	@PostMapping("/checkout")
	public Orders checkoutByUserId( @RequestBody Orders orders) {
		

		 
		 
		 return ordersRepository.save(orders);
		 
	}
	
	@GetMapping("/viewAllOrder") 
	public List<Orders> viewAllOrders() {
		return ordersRepository.findAll();
	}
	
	@DeleteMapping("/deleteOrderById/{id}")
	public String deleteOrderById(@PathVariable int id) {
		
		
		
		ordersRepository.deleteById(id);
		
		return "order deleted";
		
		
	}
	@Transactional
	@DeleteMapping("/deleteOrderDataByUsername/{username}")
	public String deleteOrderDataByProductId(@PathVariable String username) {
		orderDataService.deleteByUsername(username);
		
		return "order data deleted";
		
		
	}
	
	@Transactional
	@GetMapping("/viewAllItemsInOrderDataByUserId/{userId}") 
	public List<OrderData> viewAllItemsInOrderData(@PathVariable int userId) {
		return orderDataService.viewAllItemsInOrderData(userId);
		
	}

}
