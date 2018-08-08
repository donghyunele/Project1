package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    @Column(name = "reply_content")
    private String replyContent;
//    private String replyer;
//    @Column(name = "user_name")
//    private String userName;
    @Column(name = "reg_date")
    private Date regDate;

    public void update(Reply reply){
        this.replyContent = reply.replyContent;
    }
}
