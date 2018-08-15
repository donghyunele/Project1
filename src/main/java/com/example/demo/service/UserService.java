package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;

public interface UserService {
    void regist(Users users) throws Exception;
    Users read(String id) throws Exception;
    void modify(String id,Users users) throws  Exception;
    void remove(String id) throws Exception;
    List<Users> findAll() throws Exception;
}
