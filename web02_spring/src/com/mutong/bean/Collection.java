package com.mutong.bean;

import java.util.*;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/14 12:56
 */
public class Collection {
    //数组
    private Object[] array;
    //list
    private List list;
    //set
    private Set set;
    //map
    private Map map;
    //properties
    private Properties properties;

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
