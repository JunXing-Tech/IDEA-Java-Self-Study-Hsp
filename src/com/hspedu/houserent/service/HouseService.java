package com.hspedu.houserent.service;

import java.util.Scanner;
import com.hspedu.houserent.domain.Housing_information;

public class HouseService {
    //保存House对象
    private Housing_information[] houses;//创建名称为house的Housing_information类数组
    private int houseNums = 1;//记录当前房屋信息个数
    private int idCounter = 1;//记录当前的id增长到哪个值

    //在方法类中用构造器可以方便在main()方法中指定构造器中值得大小
    public HouseService(int size) {
        //new house
        //在main方法当创建HouseService对象时，指定数组大小
        houses = new Housing_information[size];
        //构造器初始化
        houses[0] = new Housing_information(1, "jack", "112", "zxq", 2000, "wcz");
    }

    public Housing_information[] getHouses() {
        return houses;
    }

    public void setHouses(Housing_information[] houses) {
        this.houses = houses;
    }

    //add方法,推荐新对象，返回Boolean
    public boolean add(Housing_information newHouse) {
        //考虑数组是否为满，如为满，则不能继续添加
        if (houseNums >= houses.length) {
            System.out.println("房屋列表已满");
            return false;//房屋添加失败
        }
        houses[houseNums++] = newHouse;//新增房屋
        //更新id
        newHouse.setId(++idCounter);
        return true;//房屋添加成功
    }

    //list方法，返回houses
    //编写数组类型的方法来返回数组给main方法
    public Housing_information[] list() {
        return houses;
    }

    //del方法，删除房屋信息
    public boolean del(int delId) {
        //记录房屋信息下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;//如果找不到，则直接false结束方法，后面的就无法执行
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;//操作成功
    }

    //id查找房屋
    public boolean loc(int locating) {
        //判断该id房屋是否存在
        if (houses[locating - 1] == null) {
            return false;
        } else {
            System.out.println("\t\t\t\tId\t\t姓名\t\t电话\t\t地址\t\t租金\t\t状态");
            System.out.print("id为:" + locating + "的房屋信息为:" + houses[locating - 1]);
            return true;
        }
    }

    //修改房屋
    //判断该id房屋是否存在
    public boolean id_estimate(int alt) {
        Scanner scanner = new Scanner(System.in);
        if (houses[alt - 1] == null) {
//            System.out.println("该房屋不存在，无法修改");
            return false;
        }
        System.out.print("姓名" + "(" + houses[alt - 1].getName() + "):");
        String alt_name = scanner.next();
        System.out.print("电话" + "(" + houses[alt - 1].getPh_num() + "):");
        String alt_phone = scanner.next();
        System.out.print("地址" + "(" + houses[alt - 1].getAddress() + "):");
        String alt_address = scanner.next();
        System.out.print("租金" + "(" + houses[alt - 1].getRent() + "):");
        int alt_rent = scanner.nextInt();
        System.out.print("状态" + "(" + houses[alt - 1].getState() + "):");
        String alt_state = scanner.next();
        Housing_information alt_House = new Housing_information(alt, alt_name, alt_phone, alt_address, alt_rent, alt_state);
        houses[alt - 1] = alt_House;
        return true;
    }
}
//    //用新房屋信息覆盖待修改房屋信息
//    public boolean alt(Housing_information altHouse){
//            houses[altHouse.getId() - 1] = altHouse;
//            return true;
//        }
//    }

