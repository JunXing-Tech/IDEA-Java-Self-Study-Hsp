package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        //方法一，直接通过方法访问
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(19);
        account.setPassword("12345");
        account.info();
    }
}
