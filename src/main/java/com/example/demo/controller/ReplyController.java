package com.example.demo.controller;

import com.example.demo.dao.ReplyDAO;
import com.example.demo.entity.Reply;
import com.example.demo.service.BoardService;
import com.example.demo.service.ReplyService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import java.util.List;

//@Controller 와 @RestController 차이 -> 메서드 종료 되면 화면전환 유무

@RestController
@RequestMapping("board/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping("/insert")
    public void insert(@RequestBody Reply reply) throws Exception {

//        replyService.regist(reply);

        System.out.println(reply);

//        List<Reply> replyList = replyService.findAll();

//        return replyList;
    }


}
