package com.microsrvice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microsrvice.model.OrdersMongo;

@Repository
public interface OrdersMongoRepository extends MongoRepository<OrdersMongo, Integer> {

}
