package com.mutong.dao.daoImpl;

import com.mutong.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 17:59
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void subbalance(int id, double balance) {
        String sql = "update account set balance=balance-? where id = ?";
        getJdbcTemplate().update(sql,balance,id);
    }

    @Override
    public void addbalance(int id, double balance) {
        String sql = "update account set balance = balance+? where id = ?";
        getJdbcTemplate().update(sql,balance,id);
    }
}
