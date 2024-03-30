package com.example.product_category.dao;

import com.example.product_category.dto.Category;
import com.example.product_category.repository.Category_Repository;
import org.hibernate.engine.spi.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Category_Dao {

    @Autowired
    private Category_Repository repository;

    public Category saveCategory(Category category){
        return repository.save(category);
    }

    public Optional<Category> findCategoryById(int id){
        return repository.findById(id);
    }

    public List<Category> findAllCategory(){
        return repository.findAll();
    }

    public Category updateById(int id,Category category){
        category.setId(id);
        return repository.save(category);
    }

    public void deleteCategoryById(int id){
        repository.deleteById(id);
    }
}
