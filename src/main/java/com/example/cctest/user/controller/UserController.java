package com.example.cctest.user.controller;

import com.example.cctest.log.service.LogService;
import com.example.cctest.user.bean.UserBean;
import com.example.cctest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;@Autowired
    private LogService logService;
    @RequestMapping("/index")
    public String test(){
        return "/index.html";
    }

    @RequestMapping("/register")
    public String register(){
        return "/register.html";
    }


    @RequestMapping("/toRegister")
    @ResponseBody
    public boolean toRegister(@RequestParam(value = "name")String name,
                             @RequestParam(value = "account")String account,
                             @RequestParam(value = "password")String password){

           int num  = userService.checkAccount(account);
           if (num == 0){
                UserBean userBean =new UserBean();
                userBean.setAccount(account);
                userBean.setName(name);
                userBean.setPassword(password);
                userBean.setBalance(0.0);
                userBean.setType(2);

                userService.add(userBean);
               return true;
           }else {
               return false;
           }

    }

    @RequestMapping("/submit")
    @ResponseBody
    public int submit(@RequestParam(value = "account")String account,
                      @RequestParam(value = "password")String password,
                      @RequestParam(value = "type")String type){
        UserBean userBean = userService.getInfo(account,password,type);
        if (userBean == null){
            return 0;
        }else {
            return userBean.getId();
        }
    }

    @RequestMapping("/data")
    public String dataList( String account, String name, Model model){
        List<UserBean> list = userService.getList(account,name);
        model.addAttribute("list",list);
        model.addAttribute("name",name);
        model.addAttribute("account",account);
        return "/tableData.html";
    }

    @RequestMapping("/info")
    public String info( int id, Model model){
        UserBean userBean = userService.info(id);
        model.addAttribute("userInfo",userBean);
        return "/userInfo.html";
    }

    @RequestMapping("/operate")
    public String operate( int type,int id, Model model){
        model.addAttribute("type",type);
        model.addAttribute("userId",id);
        return "/operate.html";
    }

    @RequestMapping("/operateMoney")
    @ResponseBody
    public int operateMoney(@RequestParam(value = "id")int id,
                               @RequestParam(value = "addMoney")double addMoney,
                               @RequestParam(value = "reduceMoney")double reduceMoney,
                               @RequestParam(value = "transMoney")double transMoney,
                               @RequestParam(value = "receive")String receive,
                               @RequestParam(value = "type")int type){


        if (type==1){
//            logService.
             return userService.addMoney(id,addMoney); //put in money
        }else if (type==2){
            return userService.reduceMoney(id,reduceMoney);//take out money
        }else {
              UserBean userBean = userService.selectByAccount(receive);
              if (userBean == null){
                  return -1;
              }
              userService.addMoney(userBean.getId(),transMoney);
              return  userService.reduceMoney(id,transMoney);
        }

    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam(value = "id")int id){
        return  userService.deleteById(id);
    }
}
