package com.mutong.bean;

import java.util.List;

/**
 * @description: User类
 * @Author: Mutong
 * @Date: 2020/1/13 20:50
 */
public class User {
    private String username;
    private String password;
    private List<String> list;

    //构造方法
    public User() {
        System.out.println("构造器注入");
    }

    public User(String username, String password,List<String> list) {
        this.username = username;
        this.password = password;
        this.list = list;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }
}
