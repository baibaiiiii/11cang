package com.kgc.dao;

import com.kgc.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层接口
 */
@Repository
public interface IAccountDao {

    //查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    //删除
    @Delete("delete from account where id = #{id}")
    public void deleteAccount(int id);

    //修改
    @Update("update account set name = #{name},money = #{money} where id = #{id}")
    public void updateAccount(Account account);

    //根据id查询
    @Select("select * from account where id = #{id}")
    public Account findById(int id);
}
