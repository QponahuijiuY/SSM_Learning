package com.mutong.test;

import com.mutong.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/16 19:13
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.addUser();
        userDao.deleteUSer();
    }
}
