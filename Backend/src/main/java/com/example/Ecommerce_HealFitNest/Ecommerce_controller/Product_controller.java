package com.example.Ecommerce_HealFitNest.Ecommerce_controller;

import com.example.Ecommerce_HealFitNest.Ecommerce_model.Product;
import com.example.Ecommerce_HealFitNest.Ecommerce_repository.Product_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")

@RestController
public class Product_controller {
    @Autowired
    private Product_Repo productrepo;

    @PostMapping("/addProduct")
    public String saveProduct(@RequestBody Product product){
        productrepo.save(product);
        return "Added Successfully";
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productrepo.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productrepo.deleteById(id);
        return "Deleted Successfully";
    }
}
