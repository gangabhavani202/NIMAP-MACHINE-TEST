package com.example.product_category.dao;

import com.example.product_category.dto.Product;
import com.example.product_category.repository.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Product_Dao {

    @Autowired
    private Product_Repository repository;

    public Product saveProduct(Product product){
        return  repository.save(product);
    }

    public Optional<Product> findProductById(int id){
        return  repository.findById(id);
    }

    public List<Product> findAllProduct(){
        return repository.findAll();
    }

    public Product updateProductById(int id, Product product){
        product.setId(id);
        return repository.save(product);
    }

    public void deleteProductById(int id){
        repository.deleteById(id);
    }
}
