package com.example.demo.dao;

import com.example.demo.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDAO extends JpaRepository<Board, Integer> {
}
