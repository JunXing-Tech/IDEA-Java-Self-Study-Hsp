package com.hspedu.enum_;

/**
 * @author JunXing
 * {@code @date} 2022/10/31 7:09
 */
public class Enumeration03 {
        public static void main(String[] args) {
            System.out.println(Season2.AUTUMN);
        }

    /**
     * 使用enum关键字来实现枚举类
     * 1.使用关键字enum代替class
     * 2.public static final Season2 SPRING = new Season2("ct", "wn");
     *   替代为SPRING("", "") 解读 常量名(实参列表)
     * 3.如果有多个常量(对象)，可使用逗号",",间隔即可
     * 4.使用enum实现枚举，要求将定义常量对象，写在前面
     */
//class Season01{
enum Season2{
//        private String name;
//        private String desc;
//        public static final Season2 SPRING = new Season2("ct", "wn");
//        public static final Season2 WINTER = new Season2("dt","hl");
//        public static final Season2 AUTUMN = new Season2("qt", "ls");
//        public static final Season2 SUMMER = new Season2("xt", "yr");
        SPRING("ct", "wn"),
        WINTER("dt","hl"),
        AUTUMN("qt", "ls"),
        SUMMER("xt", "yr");
        private String name;
        private String desc;
        private Season2(String name, String desc) {//配合构造器
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public String toString() {
            return "Season2{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }
    }
}
