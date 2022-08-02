package com.example.demo.service;

import com.example.demo.entity.ItemEntity;
import com.example.demo.payload.request.AddItemRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ItemService {
    ResponseEntity addItem(AddItemRequest itemRequest);
    ResponseEntity getDisplayItems();
    List<ItemEntity> getAllItems();
    ResponseEntity<List> getAllItemsByOrder(long orderID);
}
