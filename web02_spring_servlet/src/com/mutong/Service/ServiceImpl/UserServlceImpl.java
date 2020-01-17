package com.mutong.Service.ServiceImpl;

import com.mutong.Dao.UserDao;
import com.mutong.Service.UserService;
import com.mutong.bean.User;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/16 12:59
 */
public class UserServlceImpl implements UserService {
    private UserDao userDao ;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserByInfo(User user) {
        return userDao.getUserByInfo(user);
    }
}
