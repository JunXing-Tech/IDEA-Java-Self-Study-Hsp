package com.hspedu.Homework_220925.Homework_10;

public class Docter {
    //
    private String name;
    private int age;
    private String job;
    private double gender;
    private double sal;
    //
    public Docter(String name, int age, String job, double gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }
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
    public double getGender() {
        return gender;
    }
    public void setGender(double gender) {
        this.gender = gender;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    //
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(this instanceof Docter){
            Docter docter = (Docter) obj;//向下转型
            return this.getName().equals(docter.getName()) &&
                    this.getAge() == docter.getAge() &&
                    this.getJob().equals(docter.getJob()) &&
                    this.getGender() == docter.getGender() &&
                    this.getSal() == docter.getSal();
        }
        return false;
    }
}
