package com.hspedu.Homework_220925;

public class Homework01 {
    public static void main(String[] args) {
        //要明白对象数组的使用
        Person[] persons = new Person[3];
        persons[0] = new Person("Jack", 30, "manage");
        persons[1] = new Person("Tom", 20, "worker");
        persons[2] = new Person("Smith", 40, "boss");

        //在使用对象数组时，若要创建临时变量，可使用与对象数组同类型的数据类型
        Person tmp = null;
        //冒泡排序
        //for循环只可在main方法中使用,while同理
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].getAge() < persons[j + 1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
        }
        //在Java中
        //打印对象或拼接对象时，都会自动调用该对象的 toString 形式
        //当直接输出一个对象时，toString 方法会被默认的调用
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}
class Person{
    //
    private String name;
    private int age;
    private String job;
    //
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

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    //
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //重写tostring方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}