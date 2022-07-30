package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.entity.Item;
import com.example.demo.payload.request.AddItemRequest;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepo;

    @Autowired
    CategoryRepository categoryRepo;

    @Override
    public ResponseEntity addItem(AddItemRequest itemRequest) {
        ModelMapper mapper = new ModelMapper();
        Item itemEntity = mapper.map(itemRequest, Item.class);
        Optional<Category> category = categoryRepo.findById(itemRequest.getCategoryId());
        if (category.isPresent()) {
            Category categoryEntity = category.get();
            itemEntity.setCategory_id(itemRequest.getCategoryId());

            return new ResponseEntity<>(itemRepo.save(itemEntity), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Category Not found", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity getDisplayItems() {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> all = itemRepo.findAll();
        System.out.println("size : " + all.size());
        for (Item item:all){
            System.out.println(item.getAvStock()+"-"+item.getItemid()+"-"+item.getCategory_id());
        }
        return all;
    }
}