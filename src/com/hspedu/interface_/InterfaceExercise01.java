package com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        //类对象实例化引用
        System.out.println(b.a);
        //接口名.接口属性
        System.out.println(A.a);
        //因类B implements A 所以也有接口A相关的属性，可直接调用
        System.out.println(B.a);
    }
}
interface A{
    int a = 23;
    // == public static final int a = 23;
}
class B implements A {
}