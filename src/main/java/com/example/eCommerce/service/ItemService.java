package com.example.eCommerce.service;

import com.example.eCommerce.models.Item;
import com.example.eCommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public void create(Item item) {
        itemRepository.save(item);
    }


    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item getById(Integer id) {
        Optional<Item> maybeItem = itemRepository.findById(id);
        if (maybeItem.isPresent()){
            Item item = maybeItem.get();
            return item;
        }
        return null;
    }
}
