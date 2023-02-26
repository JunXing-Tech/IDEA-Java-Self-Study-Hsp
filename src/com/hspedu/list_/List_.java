package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * JunXing
 * 2023/2/25 8:37
 * IntelliJ IDEA
 */
public class List_ {
    public static void main(String[] args) {
        /**
         * List集合类中元素有序（即添加顺序一致）、且可重复
         * List集合中的每个元素都有其对应的顺序索引，即支持索引
         */
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("jack");
        System.out.println(list);

        //索引从0开始
        System.out.println(list.get(0));
    }
}
