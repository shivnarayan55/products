package com.microsrvice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsrvice.model.Cart;
import com.microsrvice.model.OrderData;
import com.microsrvice.model.Product;
import com.microsrvice.repository.CartRepository;
import com.microsrvice.repository.OrderDataRepository;
import com.microsrvice.repository.ProductRepository;
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	OrderDataRepository orderDataRepository;
	@Override
	public List<Cart> viewCartByUserId(int userId) {
		// TODO Auto-generated method stub
		return cartRepository.findByUserId(userId);
	}
	
	@Transactional
	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		cart.setTotalPrice(cart.getQuantity() * cart.getUnitPrice());
		
		System.out.println( "CART ID ===" +cart.getId());
		
		if(cart.getId() == 300) {
			OrderData orderData = new OrderData();
			orderData.setQuantity(cart.getQuantity());
			orderData.setProductId(cart.getProduct().getId());
			orderData.setProductName(cart.getProduct().getProductName());
			orderData.setUnitPrice(cart.getUnitPrice());
			orderData.setTotalPrice(cart.getTotalPrice());
			orderData.setUserId(cart.getUserId());
			orderData.setUsername(cart.getUsername());
//			orderData.setCompleted(0);
			orderDataRepository.save(orderData);
			
		} else {
			OrderData orderData = orderDataRepository.findByProductId(cart.getProduct().getId());
			orderData.setQuantity(cart.getQuantity());
			orderData.setProductId(cart.getProduct().getId());
			orderData.setProductName(cart.getProduct().getProductName());
			orderData.setUnitPrice(cart.getUnitPrice());
			orderData.setTotalPrice(cart.getTotalPrice());
			orderData.setUserId(cart.getUserId());
			orderData.setUsername(cart.getUsername());
			orderDataRepository.save(orderData);
			
			
			
		}
		
		
		
		
		
		
		return cartRepository.save(cart);
	}
	@Override
	public List<Cart> viewAllItemsInCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}
	@Override
	public Cart deleteFromCartById(int userId) {
		
		cartRepository.deleteByUserId(userId);
		return null;
		
	}
   
	@Override
	public Cart deleteFromCartByProductId(int productId) {
		// TODO Auto-generated method stub
		 cartRepository.deleteFromCartByProductId(productId);
		 return null;
	}
	
	
	
	

}
