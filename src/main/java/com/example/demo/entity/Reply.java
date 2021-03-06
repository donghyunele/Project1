package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

    @Id
    private int rno;
    @Column(name = "bno")
    private int boardNum;

    @Column
    private String replyContent;
//    private String replyer;
//    @Column(name = "user_name")
//    private String userName;
    @Column
    private Date regDate;

    public void update(Reply reply){
        this.replyContent = reply.replyContent;
    }
}
