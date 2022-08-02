package com.example.demo.service.impl;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.payload.request.CategoryRequest;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repository;

    @Override
    public ResponseEntity addCategory(CategoryRequest request) {
        ModelMapper mapper = new ModelMapper();
        CategoryEntity entity = mapper.map(request, CategoryEntity.class);
        CategoryEntity save = repository.save(entity);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @Override
    public ResponseEntity getAllItemsByCategoryName(String categoryName) {
        return null;
    }

    @Override
    public ResponseEntity<List> getAllCategories() {
        List<CategoryEntity> all = repository.findAll();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }
}
