package com.example.demo.service;

import com.example.demo.dao.ReplyDAO;
import com.example.demo.entity.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyDAO replyDAO;

    @Override
    public void regist(Reply reply) throws Exception {
        replyDAO.save(reply);
    }

    @Override
    public Reply read(int bno) throws Exception {
        return replyDAO.getOne(bno);
    }

    @Override
    public void modify(int bno, Reply reply) throws Exception {
        Reply reply2 = replyDAO.getOne(bno);
        reply2.update(reply);
        replyDAO.save(reply2);
    }

    @Override
    public void remove(int bno) throws Exception {
        replyDAO.deleteById(bno);
    }

    @Override
    public List<Reply> findAll(int boardNum) throws Exception {
        return replyDAO.findAllByBoardNum(boardNum);
    }
}
