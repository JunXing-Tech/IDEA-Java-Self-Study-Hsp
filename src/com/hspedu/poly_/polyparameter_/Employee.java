package com.hspedu.poly_.polyparameter_;

public class Employee {//定义员工类
    private String name;
    private double month_salary;

    public Employee() {
    }

    public Employee(String name, double month_salary) {
        this.name = name;
        this.month_salary = month_salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMonth_salary() {
        return month_salary;
    }
    public void setMonth_salary(double month_salary) {
        this.month_salary = month_salary;
    }

    public double getAnnual(){//计算年工资
        return 12 * getMonth_salary();
    }
}
