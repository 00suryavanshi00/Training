package com.example.nslintern.interntraining.service;

import com.example.nslintern.interntraining.model.CurrUser;
import com.example.nslintern.interntraining.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplmentation implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public boolean saveUser(CurrUser user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<CurrUser> fetchAllUser() {
        return userDao.fetchAllUser();
    }
}
