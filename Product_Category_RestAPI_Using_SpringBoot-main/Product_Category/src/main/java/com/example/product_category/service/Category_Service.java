package com.example.product_category.service;

import com.example.product_category.dao.Category_Dao;
import com.example.product_category.dao.Product_Dao;
import com.example.product_category.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Category_Service {

    @Autowired
    private Category_Dao dao;

    public Category saveCategory(Category category){
        return dao.saveCategory(category);
    }

    public Optional<Category> findCategoryById(int id){
        return dao.findCategoryById(id);
    }

    public List<Category> findAllCategory(){
        return dao.findAllCategory();
    }

    public Category updateById(int id,Category category){
        return dao.updateById(id, category);
    }

    public void deleteById(int id){
        dao.deleteCategoryById(id);
    }
}
