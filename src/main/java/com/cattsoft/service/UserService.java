package com.cattsoft.service;

import com.cattsoft.entity.User;

import java.util.List;

public interface UserService {

    int add(User user);

    List<User> selectAll();
}
