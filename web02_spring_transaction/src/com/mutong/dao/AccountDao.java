package com.mutong.dao;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 17:59
 */
public interface AccountDao {
    void subbalance(int id, double money);

    void addbalance(int id, double money);
}
