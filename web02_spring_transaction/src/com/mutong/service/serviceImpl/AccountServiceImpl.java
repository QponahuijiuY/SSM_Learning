package com.mutong.service.serviceImpl;

import com.mutong.dao.AccountDao;
import com.mutong.service.AccountService;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 17:57
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }




    @Override
    public void transferAccount() {
    accountDao.subbalance(1,100d);
    int i = 1/0;
    accountDao.addbalance(2,100d);

    }


}
