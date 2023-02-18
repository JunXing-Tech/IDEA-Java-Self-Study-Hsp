package com.hspedu.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类可以当作实参直接传递
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("匿名内部类可作为实参直接传递");
            }
        });
    }
    public  static void f1(IL il) {
        il.show();
    }
}
interface IL{
    void show();
}