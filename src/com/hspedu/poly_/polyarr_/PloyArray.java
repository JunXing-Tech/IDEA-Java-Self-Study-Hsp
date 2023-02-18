package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        //
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smoth", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < persons.length; i++) {
            //person[i] 编译类型是 Person ,运行类型是是根据实际情况有 JVM 来判断
            System.out.println(persons[i].say());//动态绑定机制
            //调用子类特有方法
            if(persons[i] instanceof Student){
                Student student = (Student)persons[i];//向下转型
                student.study();
                //((Student)persons[i]).study();
            }
            else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            }
            else{
                System.out.println();
            }
        }
    }
}
