package com.hspedu.extend_01;

public class Base {//父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public int getN4(){
        return this.n4;
    }

    public Base() {//无参构造器
        System.out.println("Base()...");
    }
    public Base(String name, int age){//有参构造器
        System.out.println("父类的有参构造器(String name, int age)被调用");
    }
    public Base(String name){//有参构造器
        System.out.println("父类的有参构造器(String name)被调用");
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void callTest400(){
        test400();
    }
}
