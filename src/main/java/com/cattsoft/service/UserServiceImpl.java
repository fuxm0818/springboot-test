package com.cattsoft.service;

import com.cattsoft.entity.User;
import com.cattsoft.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public int add(User user) {
        userMapper.insertUser(user);
//        String a = null;
//        a.toString();
        return 1;
    }

    @Override
    public List<User> selectAll(){
        return userMapper.selectAll();
    }
}
