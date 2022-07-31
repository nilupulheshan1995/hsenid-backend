package com.example.demo.service;

import com.example.demo.payload.request.CategoryRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    ResponseEntity addCategory(CategoryRequest request);
    ResponseEntity getAllItemsByCategoryName(String categoryName);
    ResponseEntity<List> getAllCategories();
}
