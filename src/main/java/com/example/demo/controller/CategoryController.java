package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/category")
public class CategoryController {

    @PostMapping(value = "/add")                    // api/category/add -> body
    public ResponseEntity<?> addCategory(@RequestBody String name) {
        // TODO: add category
        return new ResponseEntity<>("new Category :" + name, HttpStatus.OK);
    }

    @PostMapping(value = "/get/{name}")             // api/category/get/xxx
    public ResponseEntity<?> getAllItemsByCategory(@PathVariable("name") String name) {
        // TODO: get all items by categoty
        return new ResponseEntity<>("Items by :" + name, HttpStatus.OK);
    }

}
