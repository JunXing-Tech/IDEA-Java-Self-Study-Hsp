package com.hspedu.wrapper;

/**
 * JunXing
 * 2022/11/14 15:01
 * IntelliJ IDEA
 */
public class WrapperVSString {
    public static void main(String[] args) {
        /**
         * 包装类（Integer） -> String
         * 三种方法
         */
        Integer i = 100; //自动装箱
        //1.
        String str1 = i + "";
        //2.
        String str2 = i.toString();
        //3.
        String str3 = String.valueOf(i);

        /**
         * String -> 包装类(Integer)
         * 两种方法
         */
        String str4 = "12345";
        //自动装箱
        Integer i2 = Integer.parseInt(str4);
        //构造器
        Integer i3 = new Integer(str4);
    }
}
