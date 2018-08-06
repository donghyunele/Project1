package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
    private int rno;
    private int bno;
    private String replyContent;
    private String replyer;
    private String userName;
    private Date regDate;
}
