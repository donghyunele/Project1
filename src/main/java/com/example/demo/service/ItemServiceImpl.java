package com.example.demo.service;

import com.example.demo.dao.ItemDAO;
import com.example.demo.entity.Board;
import com.example.demo.entity.Item;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ItemServiceImpl implements ItemService {


    @Autowired
    private ItemDAO itemDAO;

    @Override
    public void regist(Item item) throws Exception {
        itemDAO.save(item);
    }

    @Override
    public Item read(int itemNum) throws Exception {
        return itemDAO.getOne(itemNum);
    }

    @Override
    public void modify(int itemNum, Item item) throws Exception {
        Item item1 = itemDAO.getOne(itemNum);
        item1.update(item1);
    }

    @Override
    public void remove(int itemNum) throws Exception {
        Item item1 = itemDAO.getOne(itemNum);
        item1.delete();
        itemDAO.save(item1);
    }

    @Override
    public List<Item> findAll() throws Exception {
        return null;
    }
}
