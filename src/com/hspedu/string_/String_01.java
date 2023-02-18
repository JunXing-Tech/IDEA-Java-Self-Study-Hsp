package com.hspedu.string_;

/**
 * JunXing
 * 2022/12/11 15:00
 * IntelliJ IDEA
 */
public class String_01 {
    public static void main(String[] args) {
        /**
         * 1. String对象用于保持字符串 --- 一组字符序列
         * 2. 字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节
         * 3. String类有很多构造器 --- 构造器的重载
         *      String s1 = new String();
         *      String s2 = new String(String original);
         *      String s3 = new String(char[] a);
         *      String s4 = new String(char[] a, int startIndex, int count);
         *      String s5 = new String(byte[] b);
         * 4. String类实现了 Serializable 接口 （意味着 String 可以串行化：可以在网络传输）
         *      Comparable接口 （意味着 String对象 可以比较大小）
         * 5. String 是 final类 不能被其他类继承
         * 6. 字符串本质仍然还是 char数组 --- char value[]
         *      String 有属性 private final char value[]; 用于存放字符串内容
         * 7. value是一个final类型， 指向的内存地址不可修改
         */
        final char value[] = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        //value = v2;

        /**
         * 两种创建String对象的区别
         *
         * 方式一：先从常量池中查看是否有"hsp"数据空间
         *          如果有，则直接指向
         *          如果没有则重新创建，然后指向
         *       所以，s最终指向的是常量池的空间地址
         * 方式二：先在堆中创建空间，里面维护了value属性，指向常量池的hsp空间
         *          如果常量池没有“hsp”，则重新创建
         *          如果有则直接通过value指向
         *       最终指向的是堆中的空间地址
         */
        String s = "hsp";
        String s2 = new String("hsp");

        /**
         * 下列语句 在编译器中会被 优化等价 为 String a = "helloabc";
         * 只会创建一个对象
         */
        //String a = "hello" + "abc";

        /**
         * 关键分析String c =a + b 是如何执行的。
         * 分析：底层主要是有三步：
         *          1.StringBuilder sb = new StringBuilder();
         *          2.sb.append(a);
         *          3.sb.append(b);
         * sb是在堆中，并且append是在原来字符串的基础上追加的。
         * 重要规则与区别：
         *          String c1 = "ab" + "cd"; 该语句为常量相加，是在常量池中
         *          String c1 = a + b; 该语句为变量相加，是在堆中
         */
        String a = "hello";
        String b = "abc";
        String c = a + b;
    }
}
