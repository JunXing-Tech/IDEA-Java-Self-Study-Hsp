package com.hspedu.encap;

import java.util.Scanner;

//该类仅为功能实现，不进行测试运行,所以不需要main函数类

public class Account {
    //输入用户数据
    public String name;
    private double balance;
    private String password;
    private String verify = "123456";

    //创建构造器，提供2中访问方式
    public Account() {
    }
    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }
        else{
            System.out.println("姓名长度有误，应在二位至四位，返回默认值");
            this.name = "佚名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20.0) {
            this.balance = balance;
        }
        else{
            System.out.println("余额输入有误，应大于二十，返回初始值");
            this.balance = 0.0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        }
        else{
            System.out.println("密码长度有误，应为六位，请重新输入");
        }
    }

    public void info(){
        System.out.print("请输入身份验证密码:");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.next();
        if(verify.equals(pass)) {
            System.out.println("用户名称：" + getName() + " 用户余额：" + getBalance() + " 用户密码：" + getPassword());
        }
        else{
            System.out.println("身份验证失败，无权限查看");
        }
    }
}
