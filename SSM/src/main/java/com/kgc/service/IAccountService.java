package com.kgc.service;

import com.kgc.domain.Account;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

    //删除
    public void deleteAccount(int id);

    //修改
    public void updateAccount(Account account);

    //根据id查询
    public Account findById(int id);
}
