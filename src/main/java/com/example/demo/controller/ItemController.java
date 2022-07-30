package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.payload.request.AddItemRequest;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/item")
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping(path = "/getAll")           // api/item/getALl
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> allItems = service.getAllItems();
        return new ResponseEntity<>(allItems,HttpStatus.OK);
    }

    @GetMapping(path = "/display")          //api/item/display
    public ResponseEntity<?> getdisplayItems() {
        // TODO: get display items
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping(path = "/add")             // api/item/add -> body
    public ResponseEntity<?> addItem(@RequestBody AddItemRequest itemRequest) {
        return service.addItem(itemRequest);
    }



}