package com.hspedu.Homework_221101.Homework_06;

/**
 * @author JunXing
 * {@code @date} 2022/11/2 14:59
 */
public class Person {
    private String name;
    private  Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        //想使用类方法，就得创建类对象
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void passHYS(){
        if(!(vehicles instanceof Fly)){
            vehicles = VehiclesFactory.getFly();
        }
        vehicles.work();
    }
}
