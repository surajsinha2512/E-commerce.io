package com.example.Ecommerce_HealFitNest.Ecommerce_repository;

import com.example.Ecommerce_HealFitNest.Ecommerce_model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Product_Repo extends MongoRepository<Product,Integer> {
}
