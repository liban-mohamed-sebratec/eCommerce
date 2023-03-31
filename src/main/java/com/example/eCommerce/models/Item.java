package com.example.eCommerce.models;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Integer price;
    Boolean onSale;
    String description;
    
    public Item(){

    }
    public Item(String name, Integer price, Boolean onSale, String description) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public String getDescription() {
        return description;
    }

}
