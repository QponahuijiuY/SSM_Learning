package com.mutong.dao;

/**
 * @description: 目标类
 * @Author: Mutong
 * @Date: 2020/1/16 18:48
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUSer() {
        System.out.println("删除用户");
    }
}
