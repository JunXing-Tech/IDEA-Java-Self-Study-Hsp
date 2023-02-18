package com.hspedu.StringBuffer_;

/**
 * JunXing
 * 2022/12/17 9:57
 * IntelliJ IDEA
 */
public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("Hello");

        //append();追加
        s.append(',');
        s.append("zsf");
        s.append("zm").append(100).append(true).append(10.5);
        System.out.println(s);

        /**
         * delete()
         * 删除索引为 >= start && < end 字符
         * 解读: 删除11-14的字符 具体范围为： [11, 14)
         *          半开半闭区间 左闭右开
         *          删除11 - 14 的 “索引” 从0开始
         */
        s.delete(11, 14);
        System.out.println(s);

        //replace();修改 or 替换 [9, 11)
        s.replace(9, 11, "zzr");
        System.out.println(s);

        //indexOf();
        //查找指定子串在字符串第一次出现的索引， 如找不到则返回-1
        int indexOf = s.indexOf("zsf");
        System.out.println(indexOf);

        //insert()
        //字符串插入
        //原来索引为9的内容自动后移
        s.insert(9, "zm");
        System.out.println(s);

        //StringBuffer也可以使用length()方法显示字符串长度
        System.out.println(s.length());
        System.out.println(s);
    }
}
