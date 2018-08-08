package com.example.demo.controller;

import com.example.demo.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @RequestMapping("sample/doF")
    public Product doF(){
        return new Product("스마트폰", 990000);
    }
}
