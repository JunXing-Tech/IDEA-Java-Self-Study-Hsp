package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //匿名内部类作为实参
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("123");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("456");
            }
        });
    }
}
//类不能直接使用方法，得创建一个类对象，然后对象引用方法
//类方法的形参是接口类型
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}