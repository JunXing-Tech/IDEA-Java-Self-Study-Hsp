package com.hspedu.Homework_221101.Homework_05;

/**
 * @author JunXing
 * {@code @date} 2022/11/2 14:42
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        /**
         * 先 new 一个外部类的对象
         * 在.局部内部类所在方法
         */
        a.print();
    }
}
class A {
    String name = "123";

    public void print() {
        /**
         * 局部内部类是定义在外部类的局部位置,通常在方法中
         */
        class B {
            private String name = "456";
            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        /**
         * 如想使用局部内部类 则在外部类的定义局部内部类的方法中
         * 创建局部内部类的对象 并引用局部内部类的方法
         */
        B b = new B();
        b.show();
    }
}