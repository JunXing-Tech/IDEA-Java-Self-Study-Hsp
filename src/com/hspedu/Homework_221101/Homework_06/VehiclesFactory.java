package com.hspedu.Homework_221101.Homework_06;

/**
 * @author JunXing
 * {@code @date} 2022/11/3 8:10
 */
public class VehiclesFactory {
    //创建类 并有2个方法分别获得其他类
    //如果不想创建对象 可使用静态static方法
    //为了防止new VehiclesFactory 直接私有化构造器
    private VehiclesFactory(){};
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }

    public static Fly getFly(){
        return new Fly();
    }
}
