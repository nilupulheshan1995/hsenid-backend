package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/add")
    public ResponseEntity<?> addItem(@RequestBody String item){
        // TODO: add Items
        return new ResponseEntity<>("success - "+item, HttpStatus.OK);
    }




}
