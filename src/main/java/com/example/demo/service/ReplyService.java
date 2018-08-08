package com.example.demo.service;

import com.example.demo.entity.Reply;

import java.util.List;

public interface  ReplyService {
    void regist(Reply reply) throws Exception;
    Reply read(int bno) throws Exception;
    void modify(int bno,Reply reply) throws Exception;
    void remove(int bno) throws Exception;
    List<Reply> findAll() throws Exception;
}
