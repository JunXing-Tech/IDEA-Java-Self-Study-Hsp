package com.hspedu.Homework_220925.Homework_05;

public class Employee {
    //
    private double sal;
    //
    public Employee(double sal) {
        this.sal = sal;
    }
    //
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    //
    public double year_sal(){
        return getSal() * 12;
    }
}
