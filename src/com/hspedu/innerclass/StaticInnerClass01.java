package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        //外部其他类访问静态内部类
        //
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //在外部类中编写方法返回静态内部类实例
        Outer10 outer10 = new Outer10();
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();
        //
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();
    }
}
/**
 * 静态内部类
 */
class Outer10{//外部类
    private int n1 = 10;
    private static String name = "zjx";
    private static void cry(){};
    //1.外部类成员位置
    //2.使用了static修饰
    //3.静态只能访问静态
    //4.任意访问修饰符
    //5.作用域 整个类体
    //6.成员重名，就近原则，如果想访问外部类成员
    //则可以使用（外部类目.成员）去访问
    static class Inner10{//静态成员内部类
        public void say(){
            System.out.println(name);
            cry();
        }
    }

    public void m1(){
        //外部类访问内部类
        //创建内部类对象，并调用内部类方法
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10(){
        return new Inner10();
    }

    public static Inner10 getInner10_(){
        return new Inner10();
    }
}