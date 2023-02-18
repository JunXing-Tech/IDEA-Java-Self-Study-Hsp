package com.hspedu.encap;

import java.util.Scanner;

public class Encapsulation_01
{
    public static void main(String[] args)
    {

        Person_01 person_01 = new Person_01();
        //使用set方法设置封装属性的值
        person_01.setName("Tom");
        person_01.setAge(22);
        person_01.setSalary(30000);
        //使用构造器访问
        Person_01 smith = new Person_01("smith", 800, 50000);
        System.out.println("====smith 的信息======");
        System.out.println(smith.info());
        //得到设置信息
        System.out.println(person_01.info());
    }
}
class Person_01
{
    //定义封装属性
    public String name;
    private int age;
    private double salary;
    private String pass = "123456";
    //使用构造器来封装
    public Person_01() {
    }
    public Person_01(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    //定义封装属性的get和set方法，用以后续的操作
    public String getName() {
        return name;
    }
    //加入对数据的效验
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }
        else{
            System.out.println("输入名字长度不符合，应在2-6之间,赋予默认名字");
            this.name = "佚名";
        }
    }
    public int getAge() {
        return age;
    }
    //设置年龄，并给出年龄是否合理的判断
    public void setAge(int age) {
        if(age>= 1 && age <= 120) {
            this.age = age;
        }
        else {
            System.out.println("给出的年龄不在范围内，将设置为默认年龄");
            this.age = 18;
        }
    }
    //增加读取当前对象的权限判断
    public double getSalary() {
        System.out.print("请输入访问密码：");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if(pass.equals(password)) {
            return salary;
        }
        else {
            System.out.println("密码错误，无权限，无法查看");
        }
        return 0;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //返回属性信息
    public String info()
    {
        return getName() + "\t" + getAge() + "\t" + getSalary();
    }
}