package com.hspedu.StringBuffer_;

import java.util.Scanner;

/**
 * JunXing
 * 2022/12/17 10:38
 * IntelliJ IDEA
 */
public class StringBufferExercise {
    public static void main(String[] args) {


        /**
         * StringBuffer类的lastIndexOf (String str)方法是一种内置方法，
         * 用于返回String中最后一次出现的通过子字符串作为参数的索引。
         */
        Scanner scanner = new Scanner(System.in);
        String phoneNum = scanner.next();
        String price = scanner.next();

        StringBuffer stringBuffer = new StringBuffer(price);

        for(int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3){
            stringBuffer.insert(i, ",");
        }
        System.out.println(stringBuffer);
    }
}
