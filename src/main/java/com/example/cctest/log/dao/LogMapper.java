package com.example.cctest.log.dao;

import com.example.cctest.log.bean.LogBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    List<LogBean> getList();
    int insertData(@Param("logBean") LogBean logBean);

}
