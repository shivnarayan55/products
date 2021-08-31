package com.microsrvice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsrvice.model.ProductCategory;

public interface CategoryRepository extends JpaRepository<ProductCategory, Integer> {

	

}
