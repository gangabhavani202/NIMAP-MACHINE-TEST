package com.example.product_category.controller;

import com.example.product_category.dto.Product;
import com.example.product_category.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Product_Controller {

    @Autowired
    private Product_Service service;

    @PostMapping("/product/save/{id}")
    public Product saveProduct(@RequestBody Product product){
        return  service.saveProduct(product);
    }

    @GetMapping("/product/findById/{id}")
    public Optional<Product> findProductById(@PathVariable int id){
        return service.findProductById(id);
    }

    @GetMapping("/product/findAll/page=3")
    public List<Product> findAllProduct(){
        return service.findAllProduct();
    }

    @PutMapping("/product/findById/{id}")
    public Product updateProductById(@PathVariable int id,@RequestBody Product product){
        return service.updateProductById(id,product);
    }

    @DeleteMapping("/product/delete/{id}")
    public void deleteProductById(@PathVariable int id){
        service.deleteById(id);
    }
}
