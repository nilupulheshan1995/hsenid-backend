package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/item")
public class ItemController {

    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAllItems(){
        // TODO: get aLl Items
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping(path = "/display")
    public ResponseEntity<?> getdisplayItems(){
        // TODO: get display items
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping(path = "/add")
    public ResponseEntity<?> addItem(@RequestBody String item){
        // TODO: add Items
        return new ResponseEntity<>(item, HttpStatus.FOUND);
    }




}
