package com.hspedu.encap;

public class Encapsulation_01
{
    public static void main(String[] args)
    {
        Person_01 person_01 = new Person_01();


    }
}
class Person_01
{
    //定义封装属性
    public String name;
    private int age;
    private double salary;

    //定义封装属性的get和set方法，用以后续的操作
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}