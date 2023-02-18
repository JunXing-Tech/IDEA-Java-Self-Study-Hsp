package com.hspedu.innerclass;
/**
 * 匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{//外部类
    private int n1 = 10;
    public void method(){//方法
        //基于接口的匿名内部类
        //1.需求：想使用IA接口并创建对象
        //2.传统方法：另写一个类，实现该接口，并创建对象
        //3.如需求是所写类只是使用一次，而后不再使用
        //4.则可用匿名内部类来简化开发
        //5.tiger的编译类型 是 IA
        //6.tiger的运行类型 是 匿名内部类=》类名=》Outer04$1=》外部类名+$1
        /*
            底层会分配 类名 Outer04$1
            class Outer$1 implements IA{
                @Override
                public void cry() {
                    System.out.println("老虎叫唤");
                }
            }
         */
        //7.Jdk底层在创建匿名内部类Outer04$1，
        //立即就创建了Outer04$1实例
        //并且把地址返回给tiger
        //8.匿名内部类只能使用一次
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        //getClass() 可以显示运行类型
        System.out.println("tiger的运行类型" + tiger.getClass());
        tiger.cry();

        /**
         *演示基于类的匿名内部类
         */
        //1.father编译类型 Father
        //2.father运行类型 Outer04$2
        //3.底层会创建匿名内部类
        /*
            class Outer04$2 extend Father{
            }
         */
        //4.同时也直接返回了 匿名内部类 Outer04$2的对象
        Father father = new Father(""){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println(father.getClass());
        father.test();
    }
}
interface IA{//接口
    public void cry();
}
class Father{//类
    public Father(String name){//构造器
        super();
    }
    public void test(){//方法

    }
}