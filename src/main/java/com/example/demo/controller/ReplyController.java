package com.example.demo.controller;

import com.example.demo.dao.ReplyDAO;
import com.example.demo.entity.Reply;
import com.example.demo.service.BoardService;
import com.example.demo.service.ReplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

//@Controller 와 @RestController 차이 -> 메서드 종료 되면 화면전환 유무

@Slf4j
@RestController
@RequestMapping("/board/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping("/insert")
    public int insert(@RequestBody Reply reply) throws Exception {
        log.info("/board/reply/insert : {}",reply);
        reply.setRegDate(new Date());

        replyService.regist(reply);
        return 1;
    }

    @GetMapping("/listJson")
    public List<Reply> listJson(@RequestParam int boardNum) throws Exception {
        List<Reply> list = replyService.findAll(boardNum);
        return list;
    }


}
