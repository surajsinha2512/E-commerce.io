package com.example.Ecommerce_HealFitNest.Ecommerce_repository;

import com.example.Ecommerce_HealFitNest.Ecommerce_model.Customer_SignIn;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Customer_signIn_Repo extends MongoRepository<Customer_SignIn,String> {
}
