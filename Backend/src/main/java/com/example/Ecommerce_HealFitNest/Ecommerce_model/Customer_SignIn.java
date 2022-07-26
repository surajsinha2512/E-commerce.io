package com.example.Ecommerce_HealFitNest.Ecommerce_model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Registered_Customers")

public class Customer_SignIn {
    @Id
    private String customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_password;
    private long customer_phoneNumber;

}
