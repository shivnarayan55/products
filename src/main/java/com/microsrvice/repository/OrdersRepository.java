package com.microsrvice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsrvice.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
