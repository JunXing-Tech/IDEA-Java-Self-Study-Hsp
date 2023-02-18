package com.hspedu.Homework_220925.Homework_04;

public class Worker extends Employee{
    //
    public Worker(String name, double day_salary, int days) {
        super(name, day_salary, days);
    }
    //
    @Override
    public double print_salary() {
        return super.print_salary() * 1.0;
    }
}
