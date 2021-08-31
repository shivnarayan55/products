package com.microsrvice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microsrvice.model.ProductCategory;
import com.microsrvice.service.ProductCategoryService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@PostMapping("/addCategory")
	public ProductCategory addCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryService.addCategory(productCategory);
		
		
	}
	
	@GetMapping("/viewAllCategories")
	public List<ProductCategory> viewAllCategories() {
		return productCategoryService.viewAllCategories();
	}

}
