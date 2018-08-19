package com.example.demo.service;

import com.example.demo.dao.UsersDAO;
import com.example.demo.entity.Reply;
import com.example.demo.entity.Users;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDAO usersDAO;

    @Override
    public void regist(Users users) throws Exception {
        usersDAO.save(users);
    }

    @Override
    public Users read(String id) throws Exception {
        return usersDAO.findById(id).get();
    }

    @Override
    public void modify(String id, Users users) throws Exception {
        Users users1 = usersDAO.getOne(id);
        users1.update(users);
        usersDAO.save(users1);
    }

    @Override
    public void remove(String id) throws Exception {
        usersDAO.deleteById(id);
    }

    @Override
    public List<Users> findAll() throws Exception {
        return usersDAO.findAll();
    }
}
