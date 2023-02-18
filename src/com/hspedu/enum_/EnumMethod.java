package com.hspedu.enum_;

/**
 * @author JunXing
 * {@code @date} 2022/10/31 8:12
 */

/**
 * 使用Season2来演示Enum类的方法
 */
public class EnumMethod {
    public static void main(String[] args) {

        Enumeration03.Season2 autumn = Enumeration03.Season2.AUTUMN;
        //name() 得到当前枚举常量的名称
        System.out.println(autumn.name());
        //ordinal() 输出该枚举对象的次序 从0开始
        System.out.println(autumn.ordinal());
        //values() 返回Season[] 含有定义的所有枚举对象
        Enumeration03.Season2[] values = Enumeration03.Season2.values();
        for(Enumeration03.Season2 season : values) {
            System.out.println(season);
        }
        //valuesOf() 将字符串转换为枚举对象，要求字符串必须为已有常量名
        //否则报错， 输出toString()
        Enumeration03.Season2 autumn1 = Enumeration03.Season2.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);
        //compareTo() 比较2个枚举常量 比较编号
        //底层源码 return self.ordinal - other.ordinal;
        System.out.println(Enumeration03.Season2.AUTUMN.compareTo(Enumeration03.Season2.SUMMER));
    }
}
class plus_for{
    int[] num = {1, 2, 3};

    public void pfor(){
        //普通for
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        //增强for
        for(int i : num){
            System.out.println(i);
        }
    }
}