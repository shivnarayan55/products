package com.microsrvice.service;

import java.util.List;

import com.microsrvice.model.ProductCategory;

public interface ProductCategoryService {

	ProductCategory addCategory(ProductCategory productCategory);

	List<ProductCategory> viewAllCategories();

}
