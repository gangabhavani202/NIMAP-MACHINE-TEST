package com.example.product_category.service;

import com.example.product_category.dao.Product_Dao;
import com.example.product_category.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Product_Service {

    @Autowired
    private Product_Dao dao;

    public Product saveProduct(Product product){
        return  dao.saveProduct(product);
    }

    public Optional<Product> findProductById(int id){
        return  dao.findProductById(id);
    }

    public List<Product> findAllProduct(){
        return dao.findAllProduct();
    }

    public Product updateProductById(int id, Product product){
        return dao.updateProductById(id,product);
    }

    public void deleteById(int id){
        dao.deleteProductById(id);
    }


}
