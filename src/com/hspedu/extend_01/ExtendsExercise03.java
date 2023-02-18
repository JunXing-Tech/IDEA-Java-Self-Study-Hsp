package com.hspedu.extend_01;

class Computer{//父类
    private String CPU;
    private int Memory;
    private int Disk;

    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }
    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDisk() {
        return Disk;
    }
    public void setDisk(int disk) {
        Disk = disk;
    }

    public String getDetails(){
        return getCPU() + getMemory() + getDisk();
    }

    public void Showinfo(){
        System.out.println(getCPU() + getMemory() + getDisk());
    }
}
class PC extends Computer{//子类
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void Showinfo(){
        System.out.println(getCPU() + getMemory() + getDisk() + getBrand());
    }
}

class NotPad extends Computer{//子类
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Showinfo(){
        System.out.println(getCPU() + getMemory() + getDisk() + getColor());
    }
}
