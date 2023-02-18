package com.hspedu.extend_01;

public class ExtendsExercise03_Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        PC pc = new PC();
        NotPad notPad = new NotPad();

        computer.setCPU("微软");
        computer.setMemory(64);
        computer.setDisk(2048);

        pc.setBrand("微软");
        pc.setCPU("i9");
        pc.setMemory(32);
        pc.setDisk(1024);

        notPad.setColor("黑色");
        notPad.setCPU("i7");
        notPad.setMemory(16);
        notPad.setDisk(512);

        computer.Showinfo();
        pc.Showinfo();
        notPad.Showinfo();
    }
}
