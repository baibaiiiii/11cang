package com.kgc.service.impl;

import com.kgc.dao.IAccountDao;
import com.kgc.domain.Account;
import com.kgc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询账户信息...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户信息...");
        accountDao.saveAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        System.out.println("业务层，删除账户信息");
        accountDao.deleteAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("业务层，修改账户信息");
        accountDao.updateAccount(account);
    }

    @Override
    public Account findById(int id) {
        System.out.println("业务层，根据id查询账户");
        return accountDao.findById(id);
    }


}
