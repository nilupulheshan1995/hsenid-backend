package com.example.demo.configuration;

import com.example.demo.entity.Category;
import com.example.demo.entity.Item;
import com.example.demo.entity.Order1;
import com.example.demo.entity.OrderDetails;
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
            Category category1 = new Category(1L, "Raw food", "food item");
            Category category2 = new Category(2L, "Spices", "food item");
            Category category3 = new Category(3L, "sweets", "food item");
            categoryRepository.saveAll(List.of(category1, category2, category3));

            Item i1 = new Item("Dhal","1kg Indian",100,200L,190L,0,1L);
            Item i2 = new Item("Onion","1kg SL",100,250L,230L,0,1L);
            Item i3 = new Item("Sudu Samba","Araliya 5kg",150,1200L,1100L,50,1L);
            Item i4 = new Item("Rathu Nadu","Nipuna 5kg",500,900L,850L,50,1L);
            Item i5 = new Item("Red Onion","1kg",500,230L,220L,0,1L);
            itemRepository.saveAll(List.of(i1,i2,i3,i4,i5));

            Order1 o1 = new Order1(13650,0,new Date(),0,1L);
            orderRepository.save(o1);

            OrderDetails d1 = new OrderDetails(2,1L,1L);
            OrderDetails d2 = new OrderDetails(5,2L,1L);
            OrderDetails d3 = new OrderDetails(10,3L,1L);
            detailRepository.saveAll(List.of(d1,d2,d3));

        };
    }
}
