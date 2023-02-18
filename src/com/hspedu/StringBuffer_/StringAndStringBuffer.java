package com.hspedu.StringBuffer_;

/**
 * JunXing
 * 2022/12/17 9:39
 * IntelliJ IDEA
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        /**
         * String <---> StringBuffer
         * 1.String -> StringBuffer
         * 两种方法
         *      1.1 构造器
         *      1.2 stringBuffer.append()
         *
         * 2.StringBuffer -> String
         * 两种方法
         *      2.1 构造器
         *      2.2 tostring()
         */

        /**
         * String -> StringBuffer
         */
        String str = "Hello";

        //1.构造器
        StringBuffer stringBuffer = new StringBuffer(str);

        //2.append()
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        /**
         * StringBuffer -> String
         */
        //1.toString()
        StringBuffer hspedu = new StringBuffer("hspedu");
        String s1 = hspedu.toString();

        //2.构造器
        String s = new String(hspedu);

    }
}
