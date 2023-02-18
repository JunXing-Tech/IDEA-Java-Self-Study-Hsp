package com.hspedu.innerclass;

public class test {
    public static void main(String[] args) {
        //
        Outer outer = new Outer();
        Outer.Inner inner= outer.new Inner();
        //
        outer.getInnerstance().say();
        Outer.Inner innerInstance = outer.getInnerstance();
        innerInstance.say();
        //
        new Outer().new Inner().say();
    }
}
class Outer{
    class Inner{
        public void say(){
            System.out.println("123");
        }
    }
    //
    public Inner getInnerstance(){
        return new Inner();
    }
}
interface Say{
    void say();
}