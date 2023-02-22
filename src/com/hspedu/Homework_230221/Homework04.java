package com.hspedu.Homework_230221;

import java.util.Scanner;

/**
 * JunXing
 * 2023/2/22 15:47
 * IntelliJ IDEA
 */
public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        panDuan(str);
    }

    public static void panDuan(String str){
        char[] chars = str.toCharArray();
        int u = 0, m = 0, n = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                u++;
            }
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                m++;
            }
            if(chars[i] >= '1' && chars[i] <= '9'){
                n++;
            }
        }
        System.out.println("u:"+ u + "m:" + m + "n" + n);
    }
}
