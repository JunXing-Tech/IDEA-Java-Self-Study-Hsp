package com.hspedu.StringBuffer_;

/**
 * JunXing
 * 2022/12/17 8:57
 * IntelliJ IDEA
 */
public class StringBuffer01 {
    public static void main(String[] args) {

        /**
         * 1.StringBuffer 的直接父类是 AbstractStringBuilder
         * 2.StringBuffer 实现了 Serializable --- StringBuffer对象可以进行串行化
         * 3.父类AbstractStringBuilder有属性char[] value，不是final
         *      因此，该value数组存放字符串内容 是在 堆(不在常量池) 中
         * 4.StringBuffer 是一个final类，不能被继承
         */

        /**
         * 1.String保持的是字符串常量里面的值不能修改
         *      每次String类的更新实际是更改地址，效率较低
         *      private final char[] value;
         *      ps:因为String的char[] value数组是final类型的
         *          所保存的常量是储存在常量池中
         * 2.StringBuffer保存的是字符串变量，里面的值可以更改（因为是直接保存在堆中）
         *      每次的更新实际上是更新内容，而不用更新地址，效率较高
         *      char[] value;(扩容机制)
         *      不是每次都创建新对象
         */

        /**
         * StringBuffer
         *      step into ->
         * public StringBuffer(){
         *     super(16);
         * }
         */
        /**
         *      step into ->
         * AbstractStringBuilder(int capacity){
         *     value = new char[capacity];
         * }
         */
        //创建一个size = 16 的 char[] 用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //通过构造器指定char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //通过给String创建StringBuffer,char[]大小就是 str.length + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
