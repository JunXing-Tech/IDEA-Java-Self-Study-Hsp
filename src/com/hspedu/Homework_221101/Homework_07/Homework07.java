package com.hspedu.Homework_221101.Homework_07;

/**
 * @author JunXing
 * {@code @date} 2022/11/3 9:21
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(50);
        car.air.flow();
    }
}
class Car {
    private double temperature;
    public Car(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if(getTemperature() >= 40){
                System.out.println("clf");
            }else if(getTemperature() <= 0){
                System.out.println("cnf");
            }else{
                System.out.println("gbkt");
            }
        }
    }
    Air air = new Air();
    /**
     * 返回一个Air对象
     * public Air getAir(){
     *     return Air();
     * }
     */
}
