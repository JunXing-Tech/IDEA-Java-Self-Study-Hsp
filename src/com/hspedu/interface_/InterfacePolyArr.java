package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        //
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            //判断运行类型
            if(usbs[i] instanceof Phone_){
                //向下转型
                Phone_ p = (Phone_)usbs[i];
                p.call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone_ implements Usb{
    public void call(){

        System.out.println("123");
    }

    @Override
    public void work() {
        System.out.println("456");
    }
};
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("789");
    }
};