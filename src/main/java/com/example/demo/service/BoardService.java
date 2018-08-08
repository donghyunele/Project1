package com.example.demo.service;

import com.example.demo.entity.Board;
import java.util.List;

public interface BoardService {
     void regist(Board board) throws Exception;
     Board read(int boardNum) throws Exception;
     void modify(int boardNum,Board board) throws  Exception;
     void remove(int boardNum) throws Exception;
     List<Board> findAll() throws Exception;
}
