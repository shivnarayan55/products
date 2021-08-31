package com.microsrvice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microsrvice.model.Cart;
import com.microsrvice.model.Product;
@Service
public interface CartService {

	List<Cart> viewCartByUserId(int userId);

	Cart addToCart(Cart cart);

	List<Cart> viewAllItemsInCart();

	Cart deleteFromCartById(int id);

	Cart deleteFromCartByProductId(int productId);




}
