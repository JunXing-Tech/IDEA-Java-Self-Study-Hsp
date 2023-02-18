package com.hspedu.Homework_221101.Homework_08;

/**
 * @author JunXing
 * {@code @date} 2022/11/3 10:26
 */
//创建一个Color枚举类
enum Color implements Icolor{
    //创建枚举对象
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255,0);
    //定义枚举属性
    private double redValue;
    private double greenValue;
    private double blueValue;
    //定义枚举对象属性构造器
    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue + greenValue + blueValue);
    }

    }

