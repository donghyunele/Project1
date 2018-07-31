package com.example.demo.dao;

import com.example.demo.entity.Board;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface BoardDAO extends JpaRepository<Board, Integer>, JpaSpecificationExecutor<Board> {
    List<Board> findAll(Specification<Board> isDeleted);
}
