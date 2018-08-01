package com.example.demo.service;

import com.example.demo.entity.Board;

import java.util.List;

public interface BoardService {
    public void regist(Board board) throws Exception;
    public Board read(int boardNum) throws Exception;
    public void modify(int boardNum,Board board) throws  Exception;
    public void remove(int boardNum) throws Exception;
    public List<Board> findAll() throws Exception;
}
