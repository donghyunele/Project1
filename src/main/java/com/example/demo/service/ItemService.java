package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.entity.Item;

import java.util.List;

public interface ItemService {
    public void regist(Item item) throws Exception;
    public Item read(int itemNum) throws Exception;
    public void modify(int itemNum,Item item) throws  Exception;
    public void remove(int itemNum) throws Exception;
    public List<Item> findAll() throws Exception;
}