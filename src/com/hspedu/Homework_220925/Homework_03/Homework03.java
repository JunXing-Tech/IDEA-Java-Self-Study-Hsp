package com.hspedu.Homework_220925.Homework_03;

public class Homework03 {
    public static void main(String[] args) {
        //
        Professor professor = new Professor("Jack", 50, "Professor", 1.3);
        Side_Professor side_professor = new Side_Professor("Tom", 40, "Side_Professor", 1.2);
        Lecturer lecturer = new Lecturer("Smith", 30, "Lecturer", 1.1);
        //
        System.out.println(professor.introduce());
        System.out.println(side_professor.introduce());
        System.out.println(lecturer.introduce());
    }
}
