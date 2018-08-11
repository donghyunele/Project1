package com.example.demo.controller;

import com.example.demo.dao.ItemDAO;
import com.example.demo.entity.Item;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemDAO itemDAO;

    @GetMapping("/")
    public String All(Model model) throws Exception {

        return "/item/index";
    }

    @GetMapping("/{id}")
    public String getItem(Model model, @PathVariable int id) {
        Item item = itemDAO.getOne(id);
        model.addAttribute("item", item);
        return "/item/detail";
    }
    @GetMapping("/register")
    public String regist() throws Exception {
        return "/item/register";
    }

    @PostMapping("/register")
    public String regist(Item item) throws Exception {
        itemDAO.save(item);

        return "redirect:/item";
    }
}