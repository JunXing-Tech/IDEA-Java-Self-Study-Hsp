package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * JunXing
 * 2023/2/25 8:43
 * IntelliJ IDEA
 */
public class ListMethod {
    public static void main(String[] args) {
        /**
         * 1.void add(int index, Object ele)
         *      在index位置插入ele元素
         * 2.boolean addALl(int index, Collection eles)
         *      从index位置开始将eles中的所有元素添加到引用list
         * 3.Object get(int index)
         *      获取指定index位置的元素
         * 4.int indexOf(Object obj)
         *      返回obj在集合中首次出现的位置
         * 5.int lastIndexOf(Object obj)
         *      返回obj在当前集合中末次出现的位置
         * 6.Object remove(int index)
         *      移除指定index位置的元素，并返回此元素
         * 7.Object set(int index, Object ele)
         *      设置指定index位置的元素为ele，相当于替换
         * 8.Object subList(int fromIndex, int toIndex)
         *      返回从fromIndex到toindex位置的子集合
         */

         List list= new ArrayList();
         list.add("zsf");
         list.add("jby");
         //1.
         list.add(1, "hsp");
         //2.
         List list2 = new ArrayList();
         list2.add("jack");
         list2.add("tom");
         list.addAll(1, list2);
         //3.
         //4.
         System.out.println(list.indexOf("jby"));
         //5.
         System.out.println(list.lastIndexOf("hsp"));
         //6.
         list.remove(0);
         //7.
         list.set(1, "marry");
         //8.
         // 子集合范围 fromIndex <= sublist < toIndex
         list.subList(0, 2);
    }
}
