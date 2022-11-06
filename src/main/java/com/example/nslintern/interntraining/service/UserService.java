package com.example.nslintern.interntraining.service;

import com.example.nslintern.interntraining.model.CurrUser;

import java.util.List;

public interface UserService {
    boolean saveUser(CurrUser user);

    List<CurrUser> fetchAllUser();
}
