package com.example.cctest.user.dao;

import com.example.cctest.user.bean.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    UserBean getInfo(@Param("account")String account, @Param("password")String password,@Param("type")String type);
    List<UserBean> getList(@Param("account")String account, @Param("name")String name );
    int checkAccount(@Param("account")String account);
    int add(@Param("userBean")UserBean userBean);
    UserBean info(@Param("id")int id);
    UserBean selectByAccount(@Param("account")String account);
    int addMoney(@Param("id")int id,@Param("money")double money);
    int reduceMoney(@Param("id")int id,@Param("money")double money);
    int deleteById(@Param("id")int id);

}
