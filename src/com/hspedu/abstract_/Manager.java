package com.hspedu.abstract_;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 工作中 " + " id为 " + getId() + " 工资为 " + getSalary() + " 奖金为 " + getBonus());
    }
}