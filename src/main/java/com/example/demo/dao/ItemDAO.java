package com.example.demo.dao;

import com.example.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDAO extends JpaRepository<Item, Integer> {
    List<Item> findAllByDeleted(boolean deleted);
}
