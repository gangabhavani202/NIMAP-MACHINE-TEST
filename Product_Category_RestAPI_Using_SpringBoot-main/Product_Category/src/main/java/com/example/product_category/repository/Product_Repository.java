package com.example.product_category.repository;

import com.example.product_category.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product, Integer> {


}
