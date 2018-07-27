package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    private String id;
    private String password;
    private String name;

    private int zipcode;
    private String mainaddr;
    private String subaddr;
    private String refaddr;
}
