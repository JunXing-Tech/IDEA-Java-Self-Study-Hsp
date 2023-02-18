package com.hspedu.Homework_221101.Homework_04;

/**
 * @author JunXing
 * {@code @date} 2022/11/2 10:43
 */
public class Cellphone {
    public static void main(String[] args) {
        /**
         * 如要使用匿名内部类
         * 1.先创建类的对象 new 一个
         * 2.再用类对象.形参为接口类型的方法 并以实参的形式使用
         * 3.类对象.方法(new 接口名(){
         *      @Override
         *      重写接口抽象方法
         * }, 其他形参类型);
         */
        Cal cal = new Cal();
        cal.testwork(new ICalculate(){
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 1.1, 2.2);
    }
}

/**
 * 实现类 定义一个 形参为接口类型的实现方法
 * 如要使用匿名内部类
 * 接口形参名.重写的接口抽象方法(已实现)
 */
class Cal{
    public void testwork(ICalculate IC, double n1, double n2){
        double result = IC.work(n1, n2);
        System.out.println(result);
    }
}