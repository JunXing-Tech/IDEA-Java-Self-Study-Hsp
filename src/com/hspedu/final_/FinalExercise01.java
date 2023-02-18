package com.hspedu.final_;

public class FinalExercise01 {
    //计算圆形面积，圆周率为3.14，要求final赋值的三种都尝试
    public static void main(String[] args) {
        Circle01 circle01 = new Circle01();
        Circle02 circle02 = new Circle02();
        Circle03 circle03 = new Circle03();
        System.out.println(circle01.S01());
        System.out.println(circle02.S02());
        System.out.println(circle03.S03());
    }
}
class Circle01{
    //final常量赋值
    private final double R = 11;

    public double S01(){
        return Math.PI * R * R;
    }

    @Override
    public String toString() {
        return "Circle01{" +
                "R=" + R +
                '}';
    }
}
class Circle02{
    //final构造器赋值
    private final double R;

    public Circle02() {
        R = 22;
    }

    public double S02(){
        return Math.PI * R * R;
    }

    @Override
    public String toString() {
        return "Circle02{" +
                "R=" + R +
                '}';
    }
}
class Circle03{
    //final代码块赋值
    private final double R;

    {
        R = 33;
    }

    public double S03(){
        return Math.PI * R * R;
    }

    @Override
    public String toString() {
        return "Circle03{" +
                "R=" + R +
                '}';
    }
}