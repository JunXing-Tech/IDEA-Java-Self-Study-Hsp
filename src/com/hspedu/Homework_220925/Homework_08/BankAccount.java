package com.hspedu.Homework_220925.Homework_08;

public class BankAccount {
        //余额
        private double balance;
        //
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }
        //存款
        public void deposit(double amount){
            balance += amount;
        }
        //取款
        public void withdraw(double amount){
            balance -=amount;
        }
        //
        public double getBalance() {
            return balance;
        }
        public void setBalance(int balance) {
            this.balance = balance;
        }
        //
    }

