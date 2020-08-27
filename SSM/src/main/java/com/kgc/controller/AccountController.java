package com.kgc.controller;

import com.kgc.domain.Account;
import com.kgc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户的控制层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询账户信息...");
        //调用service 完成查询账户
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);//存储到request域
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(HttpServletRequest request, HttpServletResponse response,Account account) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

    @RequestMapping("/deleteAccount")
    public void deleteAccount(int id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.deleteAccount(id);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

    @RequestMapping(value = "/updateAccount",method = RequestMethod.GET)
    public String updateAccount(int id,int flag,String name,Double money,Model model,HttpServletRequest request, HttpServletResponse response) throws IOException {
        //accountService.updateAccount(id);
        Account account = new Account();
        try {
            if (flag == 0){
                account = accountService.findById(id);
                model.addAttribute("account",account);
                return "update";
            }else if (flag == 1){
                account.setId(id);
                account.setName(name);
                account.setMoney(money);
                accountService.updateAccount(account);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:findAll";
    }
}
