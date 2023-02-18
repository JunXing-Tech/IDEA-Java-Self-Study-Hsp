package com.hspedu.innerclass;

/**
 * 局部内部类使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("m2");
    }
    public void m1(){
        //局部内部类是定义在外部类的局部位置，通常在方法中
        //局部内部类不能添加访问修饰符，可用final修饰
        //不加final可被继承，加了final不可被继承
        //作用域：仅仅在它的方法或“代码块”中
        final class Inner02{
            //可直接访问外部类的所有成员
            //变量重名根据就近原则
            private int n1 = 800;
            public void f1(){
                System.out.println("n1 = " + n1 + "外部类的n1=" + Outer02.this.n1);
                m2();
            }
        }
        //代码块中也可定义内部类
//        {
//            class Inner03{
//
//            }
//        }
        //外部类在方法中，可创建内部类对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

}