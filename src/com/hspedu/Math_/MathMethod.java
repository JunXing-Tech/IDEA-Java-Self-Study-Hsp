package com.hspedu.Math_;

import java.util.Scanner;

/**
 * JunXing
 * 2022/12/27 11:23
 * IntelliJ IDEA
 */
public class MathMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //abs
        //取绝对值
        int abs = Math.abs(-123);

        //ceil
        //向上取整
        double ceil = Math.ceil(123.456);

        //floor
        //向下取整
        double floor = Math.floor(123.456);

        //round
        //四舍五入
        double round = Math.round(123.456);

        //pow
        //幂运算
        double pow = Math.pow(2, 4);

        //sqrt
        //开方
        double sqrt = Math.sqrt(2);

        //random
        //返回 [0,1)的随机小数
        //思考：写出[a,b)之间的随机数 / 随机整数
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = 0; i < 10; i++){
            //如果是要达到随机整数且全开全闭[a,b]
            //(int)(a + Math.random() * (b - a + 1))
            System.out.println(a + Math.random() * (b - a));
        }

        //max
        //返回两数中最大值
        int max = Math.max(1 ,2);

        //min
        //返回两数中最小值
        int min = Math.min(1 ,2);
    }
}
