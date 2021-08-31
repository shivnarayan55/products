package com.microsrvice.service;

import java.util.List;
import java.util.Optional;

import com.microservice.dto.ProductDTO;
import com.microsrvice.model.Cart;
import com.microsrvice.model.Product;

public interface ProductService {
	
	public List<Product> findAllProducts();

	public Optional<Product> findProductById(int id);

	

	public Product saveProduct(Product product);



	public Product editProduct(Product product);

	public void deleteProductById(int id);

	





}
