package com.hspedu.poly_.polyparameter_;

public class Manager extends Employee{

    private double bonus;//特有属性

    public Manager(String name, double month_salary, double bonus) {
        super(name, month_salary);
        this.bonus = bonus;
    }

    public void manage(){//子类特有方法
        System.out.println("经理" + getName() + "正在管理");
    }

    public double getAnnual(){//子类重写方法
        return super.getAnnual() + bonus;
    }
}
