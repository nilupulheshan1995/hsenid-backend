package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/category")
public class CategoryController {

    @Autowired
    CategoryRepository repository;

    @PostMapping(value = "/add")                    // api/category/add -> body
    public ResponseEntity<?> addCategory(@RequestBody String name) {
        Category entity = Category.builder().name("test").description("test description").build();
        Category save = repository.save(entity);
        return new ResponseEntity<>("new Category :" + name + save, HttpStatus.OK);
    }

    @PostMapping(value = "/get/{name}")             // api/category/get/xxx
    public ResponseEntity<?> getAllItemsByCategory(@PathVariable("name") String name) {
        // TODO: get all items by categoty
        return new ResponseEntity<>("Items by :" + name, HttpStatus.OK);
    }

}
