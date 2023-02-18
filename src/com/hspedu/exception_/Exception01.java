package com.hspedu.exception_;

/**
 * @author JunXing
 * {@code @date} 2022/11/5 9:08
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        /**
         * try-catch 异常处理机制
         * 可保证程序的健壮性
         * 将所需代码块选中 快捷键 ctrl + alt + t
         * 选中 try-catch
         */
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }
}
