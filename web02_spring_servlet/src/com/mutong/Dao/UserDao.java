package com.mutong.Dao;

import com.mutong.bean.User;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/16 13:01
 */
public interface UserDao {
    //通过用户信息获取对象
    User getUserByInfo(User user);
}
