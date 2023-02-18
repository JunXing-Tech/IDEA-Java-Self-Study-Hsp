package com.hspedu.enum_;

/**
 * @author JunXing
 * {@code @date} 2022/10/29 9:49
 */
//public class Enumeration02 {
//    public static void main(String[] args) {
//        System.out.println(Season.AUTUMN);
//    }
//}
/**
 * 自定义枚举
 * 0.枚举对象名全部大写
 * 1.构造器私有化，直接 new
 * 2.去掉set相关方法，防止属性被修改
 * 3.在该类内部直接创建固定的对象
 * 4.只使用static修饰会导致类的加载
 * 5.优化 final修饰符
 */
//class Season{
//    private String name;
//    private String desc;
//
//    public static final Season SPRING = new Season("ct", "wn");
//    public static final Season WINTER = new Season("dt","hl");
//    public static final Season AUTUMN = new Season("qt", "ls");
//    public static final Season SUMMER = new Season("xt", "yr");
//
//    private Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}