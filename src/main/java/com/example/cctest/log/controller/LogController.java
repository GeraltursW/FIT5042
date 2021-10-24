package com.example.cctest.log.controller;

import com.example.cctest.log.bean.LogBean;
import com.example.cctest.log.service.LogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping("/log")
    public String log(Model model){
        List<LogBean> logBeanList = logService.getList();
       /* for (Log log:logList) {
            if(log.getType() == 1){

            }
        }*/
        model.addAttribute("list", logBeanList);
        return "/log.html";
    }
}
