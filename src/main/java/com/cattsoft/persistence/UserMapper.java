package com.cattsoft.persistence;

import com.cattsoft.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 查询某个用户
     * @param name
     * @return
     */
    User findByName(String name);


    List<User> selectAll();
}
