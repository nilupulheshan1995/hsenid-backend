package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.payload.request.CategoryRequest;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/category")
public class CategoryController {

    @Autowired
    CategoryService service;


    @PostMapping(value = "/add")                    // api/category/add -> body
    public ResponseEntity<?> addCategory(@RequestBody CategoryRequest request) {
        return service.addCategory(request);
    }

    @PostMapping(value = "/get/{name}")             // api/category/get/xxx
    public ResponseEntity<?> getAllItemsByCategory(@PathVariable("name") String name) {
        // TODO: get all items by categoty
        return new ResponseEntity<>("Items by :" + name, HttpStatus.OK);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List> getAllCategories(){
        return service.getAllCategories();
    }

}
