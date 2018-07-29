package com.example.demo.controller;

import com.example.demo.dao.BoardDAO;
import com.example.demo.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardDAO boardDAO;

    @GetMapping("/board")
    public String board(Model model){

        List<Board> boardList = boardDAO.findAll();
        model.addAttribute("board", boardList);

        return "board/allBoard";
    }

}
