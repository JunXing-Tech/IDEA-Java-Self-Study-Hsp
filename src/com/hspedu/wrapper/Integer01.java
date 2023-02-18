package com.hspedu.wrapper;

/**
 * @author JunXing
 * {@code @date} 2022/11/9 11:08
 */
public class Integer01 {
    public static void main(String[] args) {
        /**
         * 演示 int <---> Integer 的装箱与拆箱
         * jdk5前是手动装箱与拆箱
         */

        /**
         * 1.手动装箱
         * jdk5 以前 只能手动
         * 2.手动拆箱
         */
        //1.
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //2.
        int i = integer.intValue();

        /**
         * jdk5 以后 自动装箱
         */
        int n2 = 200;
        //底层使用的是 Integer.valueOf(n2)
        Integer integer2 = n2;

        int n3 = integer2;

    }
}
