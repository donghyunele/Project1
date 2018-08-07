package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.entity.Item;

import java.util.List;

public interface ItemService {
     void regist(Item item) throws Exception;
     Item read(int itemNum) throws Exception;
     void modify(int itemNum,Item item) throws  Exception;
     void remove(int itemNum) throws Exception;
     List<Item> findAll() throws Exception;
}