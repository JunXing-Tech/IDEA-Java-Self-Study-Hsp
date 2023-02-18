package com.hspedu.equals_;

public class EqualsExercise01 {
    //应用实例: 判断两个 Person 对象的内容是否相等，如果两个 Person 对象的各个属性值都一样，则返回 true，反之 false。
    public static void main(String[] args) {
        Person person1 = new Person("jack", 20, '男');
        Person person2 = new Person("jack", 20, '男');
        System.out.println(person1.equals(person2));
    }
}
class Person{
    //Person类属性
    private String name;
    private int age;
    private char gender;

    /*
        equals功能：
        1.先判断2对象是否为同一对象，如果是那不用说肯定相等，返回true
        2.如果不为同一对象，则判断2对象的值是否相等
     */
    public boolean equals(Object obj){
        if(this == obj){//1.== 1.如果判断值是数值型则直接比较其数值大小 2。如果是对象则判断其地址是否相同
            return true;
        }
        if(this instanceof Person){//2。 instanceof 左边是对象，右边是类；
                                    //当对象是右边类或子类所创建对象时，返回true；否则，返回false
            Person p = (Person) obj;//向下转型
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}