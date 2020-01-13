package com.mutong.test;

import com.mutong.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 测试类
 * @Author: Mutong
 * @Date: 2020/1/13 20:54
 */
public class HelloSpring {

    @Test
    public void Test1(){
        User user = new User();
        System.out.println(user);
    }

    //IOC反转:创建对象的工作由我们自己new转变为Spring帮我们创建
    //IOC控制:Spring容器帮助我们管理对象的生命周期
    //IOC是一种编程思想,也是一种新的设计模式,他需要DI技术的支持,依赖注入
    @Test
    public void Test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //userDao.say();

        //xml文件已经为我们设置好了值,我们直接得到bean即可
        User user1 = (User) applicationContext.getBean("User1");
        System.out.println(user1);


        //System.out.println(applicationContext.getBean("User2"));


        System.out.println(applicationContext.getBean("User3"));

//        System.out.println(applicationContext.getBean("User4"));

    }
}
