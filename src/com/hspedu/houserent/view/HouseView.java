package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.Housing_information;
import com.hspedu.houserent.service.HouseService;

import java.util.Scanner;

public class HouseView {
    //接收用户选择
    private int num;
    //控制显示菜单
    private boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    //1.新增房源
    //编写addHouse()方法接收输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("\t\t\t添加房屋");
        System.out.print("姓名：");
        String name = scanner.next();
        System.out.print("电话：");
        String phone = scanner.next();
        System.out.print("地址：");
        String address = scanner.next();
        System.out.print("月租：");
        int rent = scanner.nextInt();
        System.out.print("状态：");
        String state = scanner.next();
        //创建一个新的House对象
        Housing_information newHouse = new Housing_information(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("\t\t\t添加房屋成功");
        }else{
            System.out.println("\t\t\t添加房屋失败");
        }
    }
    //2.根据id查找房源
    public void locHouse(){
        System.out.print("请输入待查找房屋编号：");
        int locating = scanner.nextInt();
        if(houseService.loc(locating)){
            System.out.println("该房屋信息修改成功");
        }else{
            System.out.println("该id房屋不存在");
        }
    }
    //3.删除房屋
    public void delHouse(){
        System.out.print("请输入待删除房屋编号(-1退出):");
        int delId = scanner.nextInt();
        if(delId == -1) {
            System.out.println("退出删除功能");
            return;//return代表结束一个方法，结束方法用return
        }
        System.out.print("请确认是否删除(Y/N):");
        char choice = scanner.next().charAt(0);
        while(loop){
            if(choice == 'Y' || choice == 'y'){
                if(houseService.del(delId)){
                    System.out.println("删除房屋信息成功");
                    break;
                }else{
                    System.out.println("房屋编号不存在，删除失败");
                    break;
                }
            }else if(choice == 'N' || choice == 'n'){
                System.out.println("取消删除该房屋信息");
                loop = false;
            }
        }
    }
    //4.修改房屋信息
    public void altHouse(){
        System.out.print("请输入待修改房屋id：");
        int alt = scanner.nextInt();
        //Housing_information housing_information = new Housing_information();
//        houseService.id_estimate(alt);
        if(houseService.id_estimate(alt)){
            System.out.println("房屋信息修改成功");
        }else{
            System.out.println("无匹配的房屋ID");
        }
//        System.out.print("姓名：");
//        String alt_name = scanner.next();
//        System.out.print("电话：");
//        String alt_phone = scanner.next();
//        System.out.print("地址：");
//        String alt_address = scanner.next();
//        System.out.print("租金：");
//        int alt_rent = scanner.nextInt();
//        System.out.print("状态：");
//        String alt_state = scanner.next();
//        Housing_information alt_House = new Housing_information(alt, alt_name, alt_phone, alt_address, alt_rent, alt_state);
//        if(houseService.alt(alt_House)){
//            System.out.println("该房屋信息修改成功");
//        }else{
//
//        }
    }
    //5.房屋列表
    private HouseService houseService = new HouseService(10);
    //listHouse方法使用for循环遍历打印房屋信息
    public void listHouse(){
        System.out.println("\t\t\t房屋列表");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        Housing_information [] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            //判断数组内容是否为空，如为空则不输出
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("\t\t\t房屋列表显示完毕");
    }

    //6.退出
    public void exit(){
        System.out.print("确定要退出吗？(Y/N):");
        char exit = scanner.next().charAt(0);
        if(exit == 'Y' || exit == 'y'){
            loop = false;
        }else{
            return;
        }
    }
    //实现菜单显示
    public void mainMenu(){
        //1.主菜单功能显示
        System.out.println("\t\t\t房屋出租系统\t\t\t");
        System.out.println("\t\t\t1.新增房源\t\t\t");
        System.out.println("\t\t\t2.查找房源\t\t\t");
        System.out.println("\t\t\t3.删除房源\t\t\t");
        System.out.println("\t\t\t4.修改房屋信息\t\t\t");
        System.out.println("\t\t\t5.房屋列表\t\t\t");
        System.out.println("\t\t\t6.退出\t\t\t");
        System.out.print("\t\t\t请输入功能选项(1-6):");
        //2.实现主菜单功能实现
        do{
            num = scanner.nextInt();
            switch(num){
                case 1:
                    addHouse();
                    System.out.print("可继续选择:");
                    break;
                case 2:
                   locHouse();
                    System.out.print("\n可继续选择:");
                    break;
                case 3:
                    delHouse();
                    System.out.print("可继续选择:");
                    break;
                case 4:
                    altHouse();
                    System.out.print("可继续选择:");
                    break;
                case 5:
                    listHouse();
                    System.out.print("可继续选择:");
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("数字输入有误!");
                    break;
            }
        }while(loop);
        System.out.println("已退出房屋系统");
    }
}