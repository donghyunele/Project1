package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
        users.setRegDate(new Date());
        userService.regist(users);

        return "redirect:/";
    }

    @GetMapping("/list")
    public String UserList(Model model) throws Exception {

        model.addAttribute("list", userService.findAll());

        return "user/userlist";
    }

    @GetMapping("/view")
    public String OneUser(@RequestParam("id")String id, Model model) throws Exception {

        model.addAttribute("user", userService.read(id));
        return "user/oneuser";
    }

    @PostMapping("/view")
    public String checkPassword(Users users, Model model) throws Exception {

        //비밀번호 확인하는 코드
        boolean result = users.getPassword().equals( userService.read(users.getId()).getPassword());
        if(result){
            return "redirect:/users/modify?id="+users.getId();
        }
        else{
            model.addAttribute("user", userService.read(users.getId()));
            model.addAttribute("message", "비밀번호 불일치");
            return "user/oneuser";
        }
    }

    @GetMapping("/modify")
    public String modifyform(@RequestParam("id") String id,Model model) throws Exception {
        model.addAttribute("user", userService.read(id));
        return "user/modify";
    }

    @PutMapping("/modify")
    public String modify(@RequestParam("id") String id, Users users) throws Exception {
        System.out.println("----- Put modify method -----");
        userService.modify(id, users);
        return "redirect:/user/userlist";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id")String id) throws Exception {
        userService.remove(id);
        return "redirect:/user/userlist";
    }

}
