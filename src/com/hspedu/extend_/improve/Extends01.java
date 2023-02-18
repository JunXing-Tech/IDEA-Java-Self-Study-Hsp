package com.hspedu.extend_.improve;
import com.hspedu.extend_.improve.Graduate;
import com.hspedu.extend_.improve.Pupil;
public class Extends01 {

    public static void main(String[] args) {
        com.hspedu.extend_.improve.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.testing();
        pupil.age = 11;
        pupil.setScore(50);
        pupil.showInfo();
        System.out.println("=======");
        com.hspedu.extend_.improve.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
