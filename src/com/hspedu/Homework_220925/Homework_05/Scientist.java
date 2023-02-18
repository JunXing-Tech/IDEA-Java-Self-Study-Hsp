package com.hspedu.Homework_220925.Homework_05;

public class Scientist extends Employee{
    //
    private double bonus;
    //
    public Scientist(double sal, double bonus) {
        super(sal);
        this.bonus = bonus;
    }
    //
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //

    @Override
    public double year_sal() {
        return super.year_sal() + getBonus();
    }
}
