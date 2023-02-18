package com.hspedu.try_;

import java.util.Scanner;

/**
 * @author JunXing
 * {@code @date} 2022/11/7 15:00
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        /**
         * 思路
         * 1.创建Scanner对象
         * 2.使用无限循环 去接受输入
         * 3.然后将该输入的值转成一个int
         * 4.如在转换时 抛出异常 说明输入的内容不是一个可以
         * 转成int的内容
         * 5.如果没有抛出异常， 则break该循环
         */
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while(true){
            System.out.println("Please input a number");

            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("error");
            }

            System.out.println("number is" + num);
        }
    }
}
