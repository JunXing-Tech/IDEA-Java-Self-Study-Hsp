package com.hspedu.customExceptiom_;

/**
 * @author JunXing
 * {@code @date} 2022/11/7 15:54
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        //要求范围在 18 – 120 之间，否则抛出一个自定义异常
        if(!(age >= 18 && age <= 120)) {
            //这里我们可以通过构造器，设置信息
            throw new AgeException("年龄需要在 18~120 之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}

/**
 * 自定义异常
 * 1.继承 Exception 为 编译异常
 * 2.继承 RuntimeException 为 运行异常
 * 2.1 继承运行异常 可以使用默认的处理机制
 *     不需要总是显示的处理异常
 *
 * class 方法名 extends 异常名{
 *     构造器；
 * }
 * class内创建一个构造器用于调用方法传值
 */
class AgeException extends RuntimeException{

    public AgeException(String message) {
        super(message);
    }

}