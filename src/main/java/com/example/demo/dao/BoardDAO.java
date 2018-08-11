package com.example.demo.dao;

import com.example.demo.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BoardDAO extends JpaRepository<Board, Integer>, JpaSpecificationExecutor<Board>{
    Page<Board> findAll(Pageable pageable);
}
