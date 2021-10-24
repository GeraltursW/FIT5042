package com.example.cctest.log.service;

import com.example.cctest.log.bean.LogBean;
import sun.rmi.runtime.Log;

import java.util.List;

public interface LogService {
    List<LogBean> getList();
    int insertData(LogBean logBean);


}
