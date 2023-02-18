package com.hspedu.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //多态传递
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}
interface IH{
    int x = 0;
    //public static final x = 0;

}
interface IG extends IH{

}
class Teacher implements IG{

}