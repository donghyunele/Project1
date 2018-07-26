package com.example.demo.controller;

import com.example.demo.dao.UsersDAO;
import com.example.demo.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class PageController {

    @Autowired
    private UsersDAO usersDAO;

    @GetMapping("/")
    public String mainpage(){
        return "main";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    //사용자 회원가입 관련 컨트롤러
    @PostMapping("/signup")
    public String signup(String id, String password, String name){

        Users users = new Users();

        users.setId(id);
        users.setPassword(password);
        users.setName(name);
        //todo 주소 추가

        usersDAO.save(users);

        return "main";
    }

}
