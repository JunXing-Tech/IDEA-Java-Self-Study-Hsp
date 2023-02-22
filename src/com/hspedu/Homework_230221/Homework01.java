package com.hspedu.Homework_230221;

import java.util.Scanner;

/**
 * JunXing
 * 2023/2/21 8:23
 * IntelliJ IDEA
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];
        System.out.println("输入字符串");
        String string = scanner.next();
        System.out.println("输入数字");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(reverse(string, start, end));
    }
    public static String reverse(String str, int start, int end){
        if(end <= str.length() && start >0 && str != null && start < end) {
            char[] chars = str.toCharArray();
            char index = ' ';
            int j = 0, k = end - 1;
            for (int i = start - 1; i < end && i < k; i++) {
                index = chars[i];
                chars[i] = chars[k];
                chars[k] = index;
                k--;
                j++;
            }
            String strings = new String(chars);
            return strings;
        }
        else{
            return "error";
        }
    }
}
