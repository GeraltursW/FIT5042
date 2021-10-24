package com.example.cctest.user.service;

import com.example.cctest.user.bean.UserBean;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserBean getInfo(String account, String password,String type);
    List<UserBean> getList(String account, String name );
    int checkAccount(String account);
    int add(UserBean userBean);
    UserBean info(int id);

    UserBean selectByAccount(String account);
    int addMoney(int id,double money);
    int reduceMoney(int id,double money);
    int deleteById(int id);





}
