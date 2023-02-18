package com.hspedu.Homework_220925.Homework_04;

public class Homework04 {
    public static void main(String[] args) {
        //
        Manager manager = new Manager("Jack", 20000, 30);
        Worker worker = new Worker("Tom", 10000, 30);
        //
        System.out.println("Manage salary is = " + manager.print_salary());
        System.out.println("Work salary is = " + worker.print_salary());
    }
}
