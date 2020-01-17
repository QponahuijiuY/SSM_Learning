package com.mutong.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/14 12:23
 */
@Component("student2")
public class Student {
    private String id;//学号
    private String dep;//专业

    public String getId() {
        return id;
    }
    @Value("2017006160")
    public void setId(String id) {
        this.id = id;
    }

    public String getDep() {
        return dep;
    }
    @Value("软件工程")
    public void setDep(String dep) {
        this.dep = dep;
    }

    public Student(String id, String dep) {
        this.id = id;
        this.dep = dep;
    }

    public Student() {
        System.out.println("Student构造器注入");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", dep='" + dep + '\'' +
                '}';
    }
}
