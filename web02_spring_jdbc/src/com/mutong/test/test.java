package com.mutong.test;

import com.mutong.bean.User;
import com.mutong.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 14:22
 */
public class test {
    @Test
    /*
    根据id查询测试
     */
    public void test1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao.selectUserByid(1));
//        System.out.println(userDao.addUser(););
    }


    @Test
    /*
    测试查询所有的数据
     */
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> list = userDao.selectAllUser();
        for (User user : list ){
            System.out.println(user);
        }
    }
    @Test
    /*
    添加user测试
     */
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(3);
        user.setUsername("mutong1");
        user.setPassword("1234568");
        System.out.println(userDao.addUser(user));
    }

    @Test
    /*
    测试删除
     */
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.deleteUser(2);
        System.out.println(user);
    }

    /*
    测试更新数据
     */
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("JingGengChen");
        user.setId(1);
        System.out.println(userDao.updateUser(user));
    }
}
