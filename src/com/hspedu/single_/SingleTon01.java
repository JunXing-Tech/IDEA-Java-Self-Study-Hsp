package com.hspedu.single_;

//public class SingleTon01 {
//    //单例模式-饿汉式
//    //步骤
//    //1.将构造器私有化
//    //2.在类的内部直接创建对象（static对象）
//    //3.提供一个公共的static方法，返回gf对象
//    public static void main(String[] args) {
//        GirlFriend instance1 = GirlFriend.getInstance();
//        System.out.println(instance1);
//
//        GirlFriend instance2 = GirlFriend.getInstance();
//        System.out.println(instance2);
//    }
//
//}
//class GirlFriend{
//    private String name;
//    //1.
//    private GirlFriend(String name){
//        this.name = name;
//    }
//    //2.
//    private static GirlFriend gf = new GirlFriend("xhh");
//    //3.
//    public static GirlFriend getInstance(){
//        return gf;
//    }
//
//    @Override
//    public String toString() {
//        return "GirlFriend{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

public class SingleTon01 {
    public static void main(String[] args) {
        //如何保障我们只能创建一个对象
        //步骤[单例模式-饿汉式]
        //1. 将构造器私有化
        //2. 在类的内部直接创建对象(该对象是 static)
        //3. 提供一个公共的 static 方法，返回对象
        Hungry_Man_singleton instance1 = Hungry_Man_singleton.getInstance();
        System.out.println(instance1);

        Hungry_Man_singleton instance2 = Hungry_Man_singleton.getInstance();
        System.out.println(instance2);
    }
}
class Hungry_Man_singleton{
    private String name;
    //1.构造器私有化
    private Hungry_Man_singleton(String name){
        this.name = name;
    }

    //2.在类的内部直接创建静态对象
    private static Hungry_Man_singleton HMS = new Hungry_Man_singleton("zjx");

    //3.提供一个公共的static方法，并返回对象
    public static Hungry_Man_singleton getInstance(){
        return HMS;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Hungry_Man_singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}

