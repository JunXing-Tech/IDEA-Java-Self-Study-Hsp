package com.hspedu.Homework_220925.Homework_05;

public class Teacher extends Employee{
    //
    private int classDay;
    private double classSal;
    //
    public Teacher(double sal, int classDay, double classSal) {
        super(sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }
    //
    public int getClassDay() {
        return classDay;
    }
    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }
    public double getClassSal() {
        return classSal;
    }
    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public double year_sal() {
        return super.year_sal() + (getClassDay() * getClassSal());
    }
}
