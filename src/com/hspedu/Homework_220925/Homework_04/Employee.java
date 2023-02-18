package com.hspedu.Homework_220925.Homework_04;

public class Employee {
    //
    private String name;
    private double day_salary;
    private int days;
    //
    public Employee(String name, double day_salary, int days) {
        this.name = name;
        this.day_salary = day_salary;
        this.days = days;
    }
    //
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDay_salary() {
        return day_salary;
    }
    public void setDay_salary(double day_salary) {
        this.day_salary = day_salary;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    //
    public double print_salary(){
        return getDay_salary() * getDays();
    }
}
