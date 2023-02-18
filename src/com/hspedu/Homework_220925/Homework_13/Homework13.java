package com.hspedu.Homework_220925.Homework_13;

public class Homework13 {
    public static void main(String[] args) {
        //
        Homework13 homework13 = new Homework13();
        Student student = new Student("Jack", "male", 18, "123456");
        Teacher teacher = new Teacher("Tom", "female", 30, 6);
        System.out.println(student.printlnfo());
        System.out.println(teacher.printlnfo());
        //
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", "male", 10, "0001");
        persons[1] = new Student("mary", "female", 20, "0002");
        persons[2] = new Teacher("smith", "male", 36, 5);
        persons[3] = new Teacher("scott", "male", 26, 1);
        //
        Person index = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    index = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = index;
                }
            }
        }
        //
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].printlnfo());
        }
        //
        for (int i = 0; i < persons.length; i++) {
            homework13.test(persons[i]);
        }
    }

    //
    public void test(Person p) {
        if (p instanceof Student) {
            Student student = (Student) p;
            student.study();
        } else if (p instanceof Teacher) {
            Teacher teacher = (Teacher) p;
            teacher.teach();
        } else {
        }
    }
}
