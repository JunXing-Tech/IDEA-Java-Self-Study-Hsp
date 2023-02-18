package com.hspedu.houserent.domain;

public class Housing_information {
    //房屋信息定义 - 编号 房主名 电话 地址 月租 状态
    private int id;
    private String name;//出租者名称
    private String ph_num;//出租者电话号码
    private String address;//出租者地址
    private int rent;
    private String state;//房屋是否出租
    //房屋信息构造器
    public Housing_information(int id, String name, String ph_num, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.ph_num = ph_num;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

//    public Housing_information() {
//    }

    //房屋信息set()和get()函数
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPh_num() {
        return ph_num;
    }
    public void setPh_num(String ph_num) {
        this.ph_num = ph_num;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    //重写toString方法
    @Override
    public String toString() {
        return  id +
                "\t\t" + name +
                "\t" + ph_num +
                "\t\t" + address +
                "\t\t" + rent +
                "\t" + state;
    }

}
