package com.microsrvice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.dto.ProductDTO;
import com.microsrvice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
