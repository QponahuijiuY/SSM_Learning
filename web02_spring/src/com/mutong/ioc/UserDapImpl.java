package com.mutong.ioc;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/13 21:05
 */
public class UserDapImpl implements UserDao {
    private UserDao userDao;

    @Override
    public void say() {
        System.out.println("UserDao say hello world");
    }
}
