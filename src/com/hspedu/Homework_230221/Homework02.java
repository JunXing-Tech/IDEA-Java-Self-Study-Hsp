package com.hspedu.Homework_230221;

import java.util.Scanner;

/**
 * JunXing
 * 2023/2/21 15:42
 * IntelliJ IDEA
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("user");
        String user = scanner.next();
        System.out.println("password");
        String password = scanner.next();
        System.out.println("email");
        String email = scanner.next();

        Homework02 homework02 = new Homework02();
        if(User(user) && Password(password) && Email(email)){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
    }
    //1.
    public static boolean User(String user){
        if(user.length() >= 2 && user.length() <= 4){
            return true;
        }else{
            return false;
        }
    }

    //2.
    public static boolean Password(String password){
        char[] chars = password.toCharArray();

        if(password.length() != 6){
            return false;
        }else {
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    index++;
                }
            }
            if(index == chars.length){
                return true;
            }else{
                return false;
            }
        }
    }

    //3.
    public static boolean Email(String email){
        char[] chars = email.toCharArray();
        int x = 0, y = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '@'){
                x = i;
            }
            if(chars[i] == '.'){
                y = i;
            }
        }
        if(x < y && x != 0 && y != 0){
            return true;
        }else{
            return false;
        }
    }
}

