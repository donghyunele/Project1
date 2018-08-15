package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signup(){
        return "user/signup";
    }

    //사용자 회원가입 관련 컨트롤러
    @PostMapping("/signup")
    public String signup(Users users) throws Exception {

        if(Objects.isNull(users.getId()) || Objects.isNull(users.getPassword()) || Objects.isNull(users.getName()) || Objects.isNull(users.getZipCode()) || Objects.isNull(users.getMainAddr()) ||
                Objects.isNull(users.getSubAddr()) || Objects.isNull(users.getRefAddr())) {
            return "signup";
        }
        userService.regist(users);

        return "redirect:/";
    }

    @GetMapping("/list")
    public String UserList(Model model) throws Exception {

        model.addAttribute("list", userService.findAll());

        return "user/userlist";
    }

    @GetMapping("/view")
    public String OneUser(@PathVariable("id")String id, Model model) throws Exception {

        model.addAttribute("user", userService.read(id));
        return "oneuser";
    }
}
