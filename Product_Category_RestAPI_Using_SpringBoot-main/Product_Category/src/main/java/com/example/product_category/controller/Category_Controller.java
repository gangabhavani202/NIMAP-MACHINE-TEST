package com.example.product_category.controller;

import com.example.product_category.dto.Category;
import com.example.product_category.service.Category_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Category_Controller {

    @Autowired
    private Category_Service service;

    @PostMapping("/categories/save")
    public Category saveCategory(@RequestBody  Category category){
        return service.saveCategory(category);
    }

    @GetMapping("/categories/findById/{id}")
    public Optional<Category> findCategoryById(@PathVariable int id){
        return service.findCategoryById(id);
    }

    @GetMapping("/categories/findAll/page=2")
    public List<Category> findAllCategory(){
        return service.findAllCategory();
    }

    @PutMapping("/categories/findById/{id}")
    public Category updateById(@PathVariable int id,@RequestBody Category category){
        return service.updateById(id, category);
    }

    @DeleteMapping("/categories/delete/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }
}
