package com.hspedu.Homework_221101.Homework_02;

/**
 * @author JunXing
 * {@code @date} 2022/11/1 8:54
 */
public class Frock {
    private static int currentNum = 100000; //衣服出厂序列号起始值

    public static int getNextNum(){ //生成序列号 每调用一次 +100
        return currentNum += 100;
    }

    private int serialNumber;

    public int getSerialNumber() {
        return this.serialNumber = getNextNum();
    }


}
