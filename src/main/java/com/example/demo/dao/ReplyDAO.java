package com.example.demo.dao;

import com.example.demo.entity.Board;
import com.example.demo.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyDAO extends JpaRepository<Reply, Integer> {
    List<Reply> findAllByBoardNum(int boardNum);
}
