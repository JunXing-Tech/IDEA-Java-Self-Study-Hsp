package com.hspedu.string_;

/**
 * JunXing
 * 2022/12/12 9:54
 * IntelliJ IDEA
 */
public class StringUML {
    public static void main(String[] args) {
        /**
         * equals 区分大小写，判断内容是否相等
         * equalsIgnoreCase 忽略大小写的判断内容是否相等
         * length 获取字符的个数，字符串的长度
         * indexOf 获取字符在字符串中第一次出现的索引，索引从0开始，如果找不到，返回-1
         * lastIndexOf 获取字符在字符串在字符串中最后一次出现的索引，索引从0开始，如找不到，返回-1
         * substring 截取指定范围的子串
         * trim 去前后空格
         * charAt 获取某索引处的字符，注意不能使用Str[index]这种方式
         */

        /**
         * toUpperCase 转换成大写
         * toLowerCase 转换成小写
         *
         * concat 拼接字符串
         * eg.s1 = s1.concat("").concat("").concat("");
         *
         * replace 替换字符串中的字符
         * eg.replace("A", "B"); 把原字符串中的A全部替换成B
         *
         * split 分割字符串
         * eg.String str = "A, B, C, D";
         *    String[] split = str.split(",");
         *    以“,”作为分隔符将str字符串分为4个部分
         *    然后存储到名为split的字符串数组中
         *
         * toCharArray  转换成字符数组
         * eg.char[] ch = StringName.toCharArray();
         *
         * compareTo 比较两个字符串大小
         * StringA.compareTo(StringB)
         * 三种情况：
         * 1.如果长度相同，并且每个字符相同，就返回0
         * 2.如果长度相同或者不相同，但在比较时，可以区分大小
         *      就返回if(c1 != c2){
         *          return c1 - c2;
         *      }
         * 3.如果前面部分都相同，但长度不一致
         *      则返回str1.len - str1.len
         */

        /**
         * format()
         */
        String a = "123";
        int b = 456;
        float c = 789;
        char d = 'd';
        String formatStr = "%s %d %.2f %c";
        String info = String.format(formatStr, a, b, c, d);
        System.out.println(info);
    }
}
