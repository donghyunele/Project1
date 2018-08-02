package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/item")
public class ItemController {

    @GetMapping("/listAll")
    public String All(Model model) throws Exception {

        return "/item/listAll";
    }

    @GetMapping("/register")
    public String regist() throws Exception {
        return "/item/register";
    }
}
