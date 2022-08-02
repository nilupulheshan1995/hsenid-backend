package com.example.demo.configuration;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.entity.ItemEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.OrderDetailsEntity;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.OrderDetailRepository;
import com.example.demo.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class InitDataConfig {

    @Bean
    CommandLineRunner commandLineRunner(
                    CategoryRepository categoryRepository,
                    ItemRepository itemRepository,
                    OrderRepository orderRepository,
                    OrderDetailRepository detailRepository
                    ) {
        return args -> {
            CategoryEntity category1 = new CategoryEntity(1L, "Raw food", "food item");
            CategoryEntity category2 = new CategoryEntity(2L, "Spices", "food item");
            CategoryEntity category3 = new CategoryEntity(3L, "sweets", "food item");
            categoryRepository.saveAll(List.of(category1, category2, category3));

            ItemEntity i1 = new ItemEntity("Dhal","1kg Indian",100,200L,190L,0,1L);
            ItemEntity i2 = new ItemEntity("Onion","1kg SL",100,250L,230L,0,1L);
            ItemEntity i3 = new ItemEntity("Sudu Samba","Araliya 5kg",150,1200L,1100L,50,1L);
            ItemEntity i4 = new ItemEntity("Rathu Nadu","Nipuna 5kg",500,900L,850L,50,1L);
            ItemEntity i5 = new ItemEntity("Red Onion","1kg",500,230L,220L,0,1L);
            itemRepository.saveAll(List.of(i1,i2,i3,i4,i5));

            OrderEntity o1 = new OrderEntity(13650,0,new Date(),0,1L);
            orderRepository.save(o1);

            OrderDetailsEntity d1 = new OrderDetailsEntity(2,1L,1L);
            OrderDetailsEntity d2 = new OrderDetailsEntity(5,2L,1L);
            OrderDetailsEntity d3 = new OrderDetailsEntity(10,3L,1L);
            detailRepository.saveAll(List.of(d1,d2,d3));

        };
    }
}
