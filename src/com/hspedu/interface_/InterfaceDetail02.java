package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //接口属性访问形式： 接口名.属性名
        System.out.println(IB.n1);
    }
}

interface IB{
    //接口中的属性，只能是final的，而且是public static final修饰符
    //int n1 = 10; == public static final int n1 = 10;
    //属性必须初始化
    //final属性不可再赋值
    int n1 = 10;

}
//接口可以继承一个或多个接口
//接口不能继承类
//接口的修饰符只能是public和默认
interface IC extends IB{

}
interface ID extends IB, IC{

}

class Pig implements IB, IC{

}