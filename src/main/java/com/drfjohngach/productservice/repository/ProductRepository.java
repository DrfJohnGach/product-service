package com.drfjohngach.productservice.repository;

import com.drfjohngach.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
