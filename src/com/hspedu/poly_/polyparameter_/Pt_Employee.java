package com.hspedu.poly_.polyparameter_;

public class Pt_Employee extends Employee{

    public Pt_Employee(String name, double month_salary) {
        super(name, month_salary);
    }

    public void work(){//特有方法
        System.out.println("普通员工" + getName() + "正在工作");
    }

    public double getAnnual(){//重写父类方法
        return super.getAnnual();
    }
}
