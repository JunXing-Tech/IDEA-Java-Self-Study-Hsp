package com.hspedu.Homework_220925.Homework_04;

public class Manager extends Employee{
    //
    public Manager(String name, double day_salary, int days) {
        super(name, day_salary, days);
    }
    //
    @Override
    public double print_salary() {
        return 1000 + super.print_salary() * 1.2;
    }
}
