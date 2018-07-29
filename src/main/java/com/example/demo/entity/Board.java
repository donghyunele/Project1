package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @Column(name = "board_num")
    int boardNum;

    @Column(name = "writer")
    private String writer;

    @Column(name = "title")
    private String title;

    @Column(name = "reg_date")
    private Date regDate;

    @Column(name = "read_count")
    private int readCount;

    @Column(name = "content")
    private String content;

    @Column(name = "deleted")
    private Boolean deleted;

}
