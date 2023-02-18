package com.hspedu.Homework_220925.Homework_13;

public class Student extends Person{
    //
    private String stu_id;
    //
    public Student(String name, String gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }
    //
    public String getStu_id() {
        return stu_id;
    }
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    //
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }
    //
    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String printlnfo() {
        return super.printlnfo() + "\t" + getStu_id() + "\t" + this.play();
    }
}
