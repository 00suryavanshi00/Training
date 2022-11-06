package com.example.nslintern.interntraining.repository;

import com.example.nslintern.interntraining.model.CurrUser;

import java.util.List;

public interface UserDao {
    boolean saveUser(CurrUser user);

    List<CurrUser> fetchAllUser();
}
