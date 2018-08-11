package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/board")
public class serviceBoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/listAll")
    public String listAll(Model model, @RequestParam(defaultValue = "0") int page) throws Exception{
        model.addAttribute("list", boardService.findAll(new PageRequest(page,5)));
        return "/board/listAll";
    }

    @GetMapping("/register")
    public String registerForm() throws Exception{
        return "/board/register";
    }

    @PostMapping("/register")
    public String register(Board board) throws Exception {
        boardService.regist(board);
        return "redirect:/board/listAll";
    }

    @GetMapping("/read")
    public String read(@RequestParam("boardNum") int boarNum, Model model)throws Exception{

        Board board = boardService.read(boarNum);
        board.setCount(board.getCount()+1);
        boardService.regist(board);

        model.addAttribute("read",boardService.read(boarNum));
        return "/board/read";
    }

    @GetMapping("/modify")
    public String modifyFrom(@RequestParam("boardNum") int boardNum, Model model) throws Exception{
        model.addAttribute("modify",boardService.read(boardNum));
        return "/board/modify";
    }

    @PutMapping("/modify")
    public String modify(@RequestParam("boardNum") int boardNum, Board board) throws Exception {
        boardService.modify(boardNum, board);
        return "redirect:/board/listAll";
    }

    @GetMapping("/delete")
    public String deleteFrom(@RequestParam("boardNum") int boardNum, Model model) throws Exception{
        model.addAttribute("delete",boardService.read(boardNum));
        return "/board/delete";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("boardNum") int boardNum) throws Exception {
        boardService.remove(boardNum);
        return "redirect:/board/listAll";
    }
}
