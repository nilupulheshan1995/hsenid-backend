package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.payload.request.AddItemRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ItemService {
    ResponseEntity addItem(AddItemRequest itemRequest);
    ResponseEntity getDisplayItems();
    List<Item> getAllItems();
    ResponseEntity<List> getAllItemsByOrder(long orderID);
}
