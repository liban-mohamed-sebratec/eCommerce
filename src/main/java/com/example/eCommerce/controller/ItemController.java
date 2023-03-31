package com.example.eCommerce.controller;

import com.example.eCommerce.models.Item;
import com.example.eCommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public void create(@RequestBody Item item){
        itemService.create(item);
    }

   @GetMapping("/all")
    public List<Item> getAll(){
        return itemService.getAll();
   }

   @GetMapping("/{id}")
    public Item getById(@PathVariable("id") Integer id){
        return itemService.getById(id);
   }
}
