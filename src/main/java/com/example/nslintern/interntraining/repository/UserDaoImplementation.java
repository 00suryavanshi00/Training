package com.example.nslintern.interntraining.repository;

import com.example.nslintern.interntraining.model.CurrUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImplementation implements UserDao{

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "USER";

    @Override
    public boolean saveUser(CurrUser user) {
        try{
            redisTemplate.opsForHash().put(KEY, String.valueOf(user.getUserId()), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CurrUser> fetchAllUser() {
        List<CurrUser> users;
        users = redisTemplate.opsForHash().values(KEY);
        return users;
    }
}
