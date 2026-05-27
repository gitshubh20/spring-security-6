package com.shubhproject.security.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private record Product(Integer productId, String Productname, double Price) {
    }

    List<Product> products = new ArrayList<>(List.of(new Product(1, "iphone", 999.0),
            new Product(2, "Samsung", 789.0),
            new Product(3, "Xiaomi", 349.0),
            new Product(4, "Vivo", 679.0)));


    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping
    public Product saveproduct(@RequestBody Product product){
        products.add(product);
        return product;
    }
}
