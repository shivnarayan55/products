package com.microsrvice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dto.ProductDTO;
import com.microsrvice.model.Cart;
import com.microsrvice.model.Product;
import com.microsrvice.model.ProductCategory;
import com.microsrvice.repository.CartRepository;
import com.microsrvice.repository.CategoryRepository;
import com.microsrvice.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
  CategoryRepository categoryRepository;
	
	@Autowired
	CartRepository cartRepository;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method 
		return productRepository.save(product);
	}

	@Override
	public Product editProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int id) {
		 productRepository.deleteById(id);
		 
		
	}

	

	

	

	

}
