package com.mutong.dao;

import com.mutong.bean.User;

import java.util.List;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 12:38
 */
public interface UserDao {
    User selectUserByid(int id);
    List<User> selectAllUser();

    User addUser(User user);

    User deleteUser(int id);

    User updateUser(User user);
}
