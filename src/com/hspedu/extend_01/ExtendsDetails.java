package com.hspedu.extend_01;

public class ExtendsDetails {
    public static void main(String[] args) {
        System.out.println("===");
        Sub sub = new Sub();//创建子类对象sub
        System.out.println("===");
        Sub sub2 = new Sub("jack");//创建子类对象sub2
        //sub.sayOk();
        System.out.println("===");
        Sub sub3 = new Sub("king", 10);
    }
}
