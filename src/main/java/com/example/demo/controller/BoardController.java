package com.example.demo.controller;

import com.example.demo.dao.BoardDAO;
import com.example.demo.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

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

    //글쓰기 페이지로 이동
    @GetMapping("/newBoard")
    public String newBoard(){
        return "/board/newBoard";
    }
    @GetMapping("/board/{boardNum}")
    public String oneBoard (Model model, @PathVariable("boardNum") int boardNum){
        model.addAttribute("oneBoard", boardDAO.findById(boardNum).get());
        return "board/oneBoard";
    }

    @PostMapping("/newBoard")
    public String createBoard(String writer, String title, String content){

        System.out.println("1 : " + writer + ", 2 : " + title + ", 3 : " + content);
        if(Objects.isNull(writer) || Objects.isNull(title) || Objects.isNull(content)){
            return "redirect:/newBoard";
        }

        Board board = new Board();
        board.setWriter(writer);
        board.setTitle(title);
        board.setContent(content);
        board.setDeleted(false);
        boardDAO.save(board);

        return "redirect:/board";
    }
}
