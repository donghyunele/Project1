package com.example.demo.controller;

import com.example.demo.dao.ReplyDAO;
import com.example.demo.entity.Reply;
import com.example.demo.service.BoardService;
import com.example.demo.service.ReplyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

//@Controller 와 @RestController 차이 -> 메서드 종료 되면 화면전환 유무

@Controller
@RequestMapping("board/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping("/insert")
    public void insert(Reply reply) throws Exception {

        System.out.println("여기");
        replyService.regist(reply);
    }


}
