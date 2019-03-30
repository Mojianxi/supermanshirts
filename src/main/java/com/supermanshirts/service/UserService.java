package com.supermanshirts.service;

import com.supermanshirts.entity.UserEntity;
import com.supermanshirts.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public void insertUser(UserEntity user) {
        userMapper.insert(user);
    }

    public UserEntity getUser(int id){
        return userMapper.getUser(id);
    }
    public UserEntity getUser(String username,String userpass){
        return userMapper.getUserByName(username);
    }

//    public int updateOne(UserEntity user){
//        return userMapper.updateOne(user);
//    }
}
