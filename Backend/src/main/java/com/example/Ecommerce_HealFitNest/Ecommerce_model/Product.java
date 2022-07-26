package com.example.Ecommerce_HealFitNest.Ecommerce_model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Product")


public class Product {

    @Id
    private int productid;
    private String productName;
    private String category;
    private String SubCategory;
    private int quantity;
    private String decription;
    private int cost;
}
