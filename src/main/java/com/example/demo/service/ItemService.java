package com.example.demo.service;

import com.example.demo.payload.request.AddItemRequest;
import org.springframework.http.ResponseEntity;

public interface ItemService {
    ResponseEntity addItem(AddItemRequest itemRequest);
    ResponseEntity getDisplayItems();
    ResponseEntity getAllItems();

}
