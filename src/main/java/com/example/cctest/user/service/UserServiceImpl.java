package com.example.cctest.user.service;


import com.example.cctest.user.bean.UserBean;
import org.springframework.stereotype.Service;
import com.example.cctest.user.dao.UserMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean getInfo(String account, String password,String  type) {

        return userMapper.getInfo(account,password,type) ;
    }

    @Override
    public List<UserBean> getList(String account, String name) {
        return userMapper.getList(account,name);
    }

    @Override
    public int checkAccount(String account) {
        return userMapper.checkAccount(account);
    }

    @Override
    public int add(UserBean userBean) {
        return userMapper.add(userBean);
    }

    @Override
    public UserBean info(int id) {
        return userMapper.info(id);
    }

    @Override
    public UserBean selectByAccount(String account) {
        return userMapper.selectByAccount(account);
    }

    @Override
    public int addMoney(int id,double money) {
        return userMapper.addMoney(id,money);
    }

    @Override
    public int reduceMoney(int id,double money) {
        return userMapper.reduceMoney(id,money);
    }

    @Override
    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }
}
