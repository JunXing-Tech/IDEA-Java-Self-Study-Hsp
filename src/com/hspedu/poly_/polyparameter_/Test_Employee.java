package com.hspedu.poly_.polyparameter_;

public class Test_Employee {
    //主方法
    public static void main(String[] args) {
        Pt_Employee tom = new Pt_Employee("Tom", 10000);
        Manager jack = new Manager("Jack", 20000, 200000);
        Test_Employee test_employee = new Test_Employee();
        test_employee.showEmpAnnual(tom);
        test_employee.showEmpAnnual(jack);
        test_employee.testWork(tom);
        test_employee.testWork(jack);
    }
    //其他方法，不能把方法放进方法中
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    //
    public void testWork(Employee w){
        if(w instanceof Pt_Employee){
            Pt_Employee tom = (Pt_Employee) w;
            tom.work();
            //((Pt_Employee) w).work();
        }
        else if(w instanceof Manager){
            Manager jack = (Manager) w;
            jack.manage();
            //((Manager) w).manage();
        }

    }
}

