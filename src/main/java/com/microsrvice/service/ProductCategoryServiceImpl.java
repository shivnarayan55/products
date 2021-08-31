package com.microsrvice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsrvice.model.ProductCategory;
import com.microsrvice.repository.CategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public ProductCategory addCategory(ProductCategory productCategory) {
		return categoryRepository.save(productCategory);
	}

	@Override
	public List<ProductCategory> viewAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	
	
	

}
