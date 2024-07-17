package com.example.mapper;

import com.example.entity.Account;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface UserMapper {
    int insert(User user);
    void deleteById(Integer id);


    int updateById(User user);

    User selectById(Integer id);

    List<User> selectAll(User user);

    User selectByUsername(String username);
}
