package com.example.demosql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productrepository;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        return productrepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productrepository.findAll();
    }
	
	

}
