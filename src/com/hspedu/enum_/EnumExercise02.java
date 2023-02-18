package com.hspedu.enum_;

/**
 * @author JunXing
 * {@code @date} 2022/10/31 8:47
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for(Week weeks : values){
            System.out.println(weeks);
        }
    }
}

enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String day;
    private Week(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Week{" +
                "day='" + day + '\'' +
                '}';
    }
}