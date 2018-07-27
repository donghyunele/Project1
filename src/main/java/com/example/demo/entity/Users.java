package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    private String id;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "zip_code")
    private int zipCode;
    @Column(name = "main_addr")
    private String mainAddr;
    @Column(name = "sub_addr")
    private String subAddr;
    @Column(name = "ref_addr")
    private String refAddr;
}
