package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public String All(Model model) throws Exception {
        List<Item> list = itemService.findAll();
        model.addAttribute("list", list);

        return "item/read";
    }

    @GetMapping("/{id}")
    public String getItem(Model model, @PathVariable int id) {
//        Item item = itemService.getOne(id);
//        model.addAttribute("item", item);
        return "item/detail";
    }
    @GetMapping("/register")
    public String regist() throws Exception {
        return "item/register";
    }

    @PostMapping("/register")
    public String regist(Item item) throws Exception {
//        itemService.save(item);

        return "redirect:/item";
    }
}
