package com.microsrvice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dto.ProductDTO;
import com.microsrvice.model.Cart;
import com.microsrvice.model.Product;
import com.microsrvice.service.CartService;
import com.microsrvice.service.ProductService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class ProductController {
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/save")
	public Product saveMyProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/viewAllproducts")
	
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
	
	@GetMapping("/viewProduct/{id}")
	public Optional<Product> getProductById(@PathVariable int id){
		return productService.findProductById(id);
	}
	
	@PutMapping("/edit")
	public Product editProduct(@RequestBody Product product) {
		return productService.editProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		productService.deleteProductById(id);
		
		return "product Deleted";
	}
	
	
	
}
