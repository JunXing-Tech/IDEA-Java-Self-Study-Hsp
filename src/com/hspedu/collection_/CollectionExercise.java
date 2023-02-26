package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JunXing
 * 2023/2/23 11:42
 * IntelliJ IDEA
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Dog("dog01", 1));
        col.add(new Dog("dog02", 2));
        col.add(new Dog("dog03", 3));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=======");
        for (Object dog: col) {
            System.out.println(dog);
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}