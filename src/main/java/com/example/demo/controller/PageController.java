package com.example.demo.controller;

import com.example.demo.dao.UsersDAO;
import com.example.demo.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

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

    @GetMapping("/event")
    public String event(){
        return "event";
    }
    @GetMapping("/summernote")
    public String summerNote(){
        return "summernote";
    }

    //사용자 회원가입 관련 컨트롤러
    @PostMapping("/signup")
    public String signup(String id, String password, String name, int zipCode, String mainAddr, String subAddr, String refAddr){

        if(Objects.isNull(id) || Objects.isNull(password) || Objects.isNull(name) || Objects.isNull(zipCode) || Objects.isNull(mainAddr) ||
                Objects.isNull(subAddr) || Objects.isNull(refAddr)) {
            return "signup";
        }

        Users users = new Users();

        users.setId(id);
        users.setPassword(password);
        users.setName(name);
        users.setZipCode(zipCode);
        users.setMainAddr(mainAddr);
        users.setSubAddr(subAddr);
        users.setRefAddr(refAddr);

        Users registeredUser = usersDAO.save(users);
        if( Objects.isNull(registeredUser)) {
            return "signup";
        }

        return "redirect:/";
    }

}
