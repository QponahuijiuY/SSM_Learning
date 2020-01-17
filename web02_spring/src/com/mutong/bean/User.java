package com.mutong.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: User类
 * @Author: Mutong
 * @Date: 2020/1/13 20:50
 */
//<bean id="User1" class="com.User">
@Repository("user1")
public class User {
    private String username;
    private String password;
    private Student student;
    private List<String> list;

    //构造方法
    public User() {
        System.out.println("User构造器注入");
    }

    public User(String username, String password,List<String> list,Student student) {
        this.username = username;
        this.password = password;
        this.list = list;
        this.student = student;
    }
    //静态方法
    public static String test1(){
        String str = "静态方法注入";
        return str;
    }
    //实例方法
    public String test2(){
        String str = "实例方法注入" ;
        return str;
    }
    public String getUsername() {
        return username;
    }
    @Value("com/mutong")
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    @Value("123456")
    public void setPassword(String password) {
        this.password = password;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public Student getStudent() {
        return student;
    }


    //自动装配
    @Autowired
    //手动注入
    //@Resource(name = "jgc")
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", student=" + student +
                ", list=" + list +
                '}';
    }
}
