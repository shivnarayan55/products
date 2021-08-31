package com.microsrvice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microsrvice.model.Cart;
import com.microsrvice.model.ProductCategory;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	List<Cart> findByUserId(int userId);

	void deleteByUserId(int userId);

	

	void deleteFromCartByProductId(int productId);

	

}
