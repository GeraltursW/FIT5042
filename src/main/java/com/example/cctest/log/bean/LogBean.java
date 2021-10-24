package com.example.cctest.log.bean;

import java.sql.Date;

public class LogBean {
    private int id;
    private String sendAccount;
    private String receiveAccount;
    private Date sendTime;
    private int type;
    private double amount;
    private int userId;

    public LogBean() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSendAccount() {
        return sendAccount;
    }

    public void setSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
    }

    public String getReceiveAccount() {
        return receiveAccount;
    }

    public void setReceiveAccount(String receiveAccount) {
        this.receiveAccount = receiveAccount;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
