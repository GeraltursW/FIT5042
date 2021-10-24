package com.example.cctest.user.bean;

public class UserBean {
    private int id;
    private String account;
    private String password;
    private String name;
    private Double balance;
    private int type;


    public UserBean(int id, String account, String password, String name, Double balance, int type) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public UserBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
