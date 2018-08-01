package com.example.demo.service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {


    @Autowired
    private BoardDAO boardDAO;

    @Override
    public void regist(Board board) throws Exception {
        boardDAO.save(board);
    }

    @Override
    public Board read(int boardNum) throws Exception {
        return boardDAO.getOne(boardNum);
    }

    @Override
    public void modify(int boardNum, Board board) throws Exception {
        Board dbBoard = boardDAO.getOne(boardNum);
        dbBoard.update(board);
        boardDAO.save(dbBoard);
    }

    @Override
    public void remove(int boardNum) throws Exception {
        Board dbBoard = boardDAO.getOne(boardNum);
        dbBoard.delete();
        boardDAO.save(dbBoard);
    }

    @Override
    public List<Board> findAll() throws Exception {
        Specification<Board> del = Specifications.where(BoardSpecification.deleted(false));
        return boardDAO.findAll(del);
    }
}
