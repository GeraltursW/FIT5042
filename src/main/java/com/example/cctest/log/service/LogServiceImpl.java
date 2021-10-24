package com.example.cctest.log.service;

import com.example.cctest.log.bean.LogBean;
import com.example.cctest.log.dao.LogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LogServiceImpl implements LogService{

    @Resource
    private LogMapper logMapper;
    @Override
    public List<LogBean> getList() {
        return logMapper.getList();
    }

    @Override
    public int insertData(LogBean logBean) { return (logMapper.insertData(logBean));
    }
}