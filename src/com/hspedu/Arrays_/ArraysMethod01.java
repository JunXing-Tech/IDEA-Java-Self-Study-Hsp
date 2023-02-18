package com.hspedu.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JunXing
 * 2022/12/30 16:40
 * IntelliJ IDEA
 */
public class ArraysMethod01 {
    public static void main(String[] args) {

        /**
         * toString返回数组的字符串形式
         * Arrays,toString(arr)
         */
        /**
         * 传统for遍历数组
         * for(int i = 0; i < integers.length; i++){
         *     System.out.println(integers[i]);
         * }
         */
        /**
         * 现在可以直接使用Arrays.tostring方法，显示数组
         * 源代码：
         * public static String toString(Object[] a){
         *     if(a == null){
         *         return "null";
         *     }
         *
         *     int iMax = a.length - 1;
         *     if(iMax == -1)
         *      return "[]"
         *
         *     StringBuilder b = new StringBuilder();
         *     b.append('[');
         *     for(int i = 0; ; i++){
         *         b.append(String.valueOf(a[i]));
         *         if(i == iMax)
         *          return b.append(']').toString();
         *         b.append(", ");
         *     }
         * }
         */
        Integer[] integers = {1 , 20, 90};
        System.out.println(Arrays.toString(integers));

        /**
         * sort排序（自然排序和定制排序）
         * 1.可以直接使用冒泡排序
         *      也可以直接使用Arrays提供的sort方法排序
         * 2.因为数组是应用排序，所以通过sort排序后，
         *      会直接影响到实参arr
         * 3.sort重载的，也可以通过传入一个接口Comparator实现定制排序
         *      sort(T[] a, Comparator<? super T> c)
         * 4.调用定制排序时，传入两个参数
         *      4.1 排序的数组arr
         *      4.2 实现了Comparator接口的匿名内部类，要求实现compare方法
         */
        /**
         * 这里体现了接口编程的方式 , 看看源码，就明白
         * 源码分析
         * (1) Arrays.sort(arr, new Comparator()
         * (2) 最终到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start, // Comparator<? super T> c)()
         * (3) 执行到 binarySort 方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的
         * 匿名内部类的 compare ()
         * while (left < right) {
         * int mid = (left + right) >>> 1;
         * if (c.compare(pivot, a[mid]) < 0)
         *      right = mid;
         *      else
         *      left = mid + 1;
         * }
         * (4) new Comparator() {
         * @Override
         * public int compare(Object o1, Object o2) {
         *      Integer i1 = (Integer) o1;
         *      Integer i2 = (Integer) o2;
         *      return i2 - i1;
         *      }
         * }
         * (5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
         * 会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
         * 将来的底层框架和源码的使用方式，会非常常见
         */
        Integer arr[] = {1, -1, 7, 0, 89};
        //Arrays.sort(arr); 非定制排序
        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                //return i1 - i2; 从小到大
                return i2 - i1; //从大到小
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
