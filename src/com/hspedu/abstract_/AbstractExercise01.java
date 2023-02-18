package com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 999, 50000, 2000);
        jack.setBonus(8000);
        jack.work();
        CommonEmployee tom = new CommonEmployee("tom", 888, 20000);
        tom.work();
    }
}
//当父类为抽象类时，若由子类来重写父类抽象方法，则子类也要设为抽象类

