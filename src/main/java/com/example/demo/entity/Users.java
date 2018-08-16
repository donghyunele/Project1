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
public class Users {

    @Id
    private String id;
    @Column(name = "password")
    private String password;
    private String name;
    private String zipCode;
    private String mainAddr;
    private String subAddr;
    private String refAddr;
    private Date regDate;
    public void update(Users users){
        this.password = users.password;
        this.mainAddr = users.mainAddr;
        this.zipCode = users.zipCode;
        this.subAddr = users.subAddr;
        this.refAddr = users.refAddr;
    }
}
