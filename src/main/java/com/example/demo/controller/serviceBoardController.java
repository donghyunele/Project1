package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class serviceBoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/register")
    public String registerForm() throws Exception{
        return "/board/register";
    }

    @PostMapping("/register")
    public String register(Board board) throws Exception {
        boardService.regist(board);

        boardService.regist(board);
        return "redirect:/board/listAll";
    }

    @GetMapping("/read")
    public String read(@RequestParam("boardNum") int boarNum, Model model)throws Exception{
        model.addAttribute("read",boardService.read(boarNum));
        return "/board/read";
    }

    @GetMapping("/listAll")
    public String listAll(Model model) throws Exception{
        model.addAttribute("list", boardService.findAll());
        return "/board/listAll";
    }
}
