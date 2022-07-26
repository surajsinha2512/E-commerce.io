package com.example.Ecommerce_HealFitNest.Ecommerce_controller;

import com.example.Ecommerce_HealFitNest.Ecommerce_model.Customer_SignIn;
import com.example.Ecommerce_HealFitNest.Ecommerce_repository.Customer_signIn_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v2")

@RestController
public class Customer_signIn_controller {

    @Autowired
    private Customer_signIn_Repo registeredCustomer_repo;

    @PostMapping("/addCustomer")
    public String saveCustomer(@RequestBody Customer_SignIn customer){
        registeredCustomer_repo.save(customer);
        return "Customer Added Successfully";
    }
    @GetMapping("/customers")
    public List<Customer_SignIn> getCustomer(){
        return registeredCustomer_repo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable String id){
        registeredCustomer_repo.deleteById(id);
        return "Deleted Successfully";
    }
}
