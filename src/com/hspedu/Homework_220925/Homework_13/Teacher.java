package com.hspedu.Homework_220925.Homework_13;

public class Teacher extends Person{
    //
    private int work_age;
    //
    public Teacher(String name, String gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }
    //
    public int getWork_age() {
        return work_age;
    }
    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    //
    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }
    //
    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public String printlnfo() {
        return super.printlnfo() + "\t" + getWork_age() + "\t" +this.play();
    }
}
