package com.hspedu.collection_;

import java.util.ArrayList;

/**
 * JunXing
 * 2023/2/23 10:43
 * IntelliJ IDEA
 */
public class CollectionMethod {
    public static void main(String[] args) {
        /**
         * 1.add 添加单个元素(object)
         * 2.remove 删除指定元素
         * 3.contains 查找元素是否存在
         * 4.size 返回元素个数
         * 5.isEmpty 判断元素是否为空
         * 6.clear 清空
         * 7.addALL 添加多个元素
         * 8.containsALL 查找多个元素是否存在
         * 9.removeALL 删除多个元素
         */
        ArrayList arrayList = new ArrayList();
        //1.
        arrayList.add("jack");
        arrayList.add(10); //list.add(new Integer(10))
        arrayList.add(true);
        System.out.println(arrayList);

        //2.
        arrayList.remove(0);//删除第一个元素
        System.out.println(arrayList);
        arrayList.remove("jack");
        System.out.println(arrayList);

        //3.
        arrayList.contains("jack");//返回值为boolean类型

        //4.
        System.out.println(arrayList.size());

        //5.
        System.out.println(arrayList.isEmpty());

        //6.
        arrayList.clear();

        //7.
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("zjx");
        arrayList1.add("lb");
        arrayList.addAll(arrayList1);//可以传入实现了Collection接口的类的对象

        //8.
        System.out.println(arrayList.containsAll(arrayList1));//boolean

        //9.
        //删除传入对象中与引用对象中多个相同的内容
        arrayList.removeAll(arrayList1);















    }
}
