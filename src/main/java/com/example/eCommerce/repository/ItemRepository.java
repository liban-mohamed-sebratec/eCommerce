package com.example.eCommerce.repository;

import com.example.eCommerce.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
