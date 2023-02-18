package com.hspedu.Homework_220925.Homework_10;

public class Homework10 {
    public static void main(String[] args) {
        Docter docter1 = new Docter("Jack", 20, "teacher", 5, 10000);
        Docter docter2 = new Docter("Jack", 21, "teacher", 5, 10000);
        System.out.println(docter1.equals(docter2));
    }
}
