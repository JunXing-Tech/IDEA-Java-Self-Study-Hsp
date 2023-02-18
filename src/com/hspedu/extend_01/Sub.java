package com.hspedu.extend_01;

public class Sub extends Base{//子类
    public Sub() {//无参构造器
        //super();默认调用父类的无参构造器
        super("tom", 20);
        System.out.println("sub()...");
    }
    public Sub(String name){
        //do nothing
        super("smith", 30);
        System.out.println("Sub(String name)...");
    }
    public Sub(String name, int age){

        System.out.println("子类Sub(String name, int age)构造器被调用");
    }
    public void sayOk(){//子类方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有的属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();错误
        //要通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
