package com.example.demo.controller;

import com.example.demo.dao.UsersDAO;
import com.example.demo.entity.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Controller
public class PageController {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @Autowired
    private UsersDAO usersDAO;

    @GetMapping("/")
    public String mainpage(){
        return "main";
    }



    @GetMapping("/event")
    public String event(){
        return "event";
    }
    @GetMapping("/summernote")
    public String summerNote(){
        return "summernote";
    }


}
