public class Homework007
{
    public static void main(String[] args)
    {
        Dog01 d01 = new Dog01("tom", "yellow", 10);
        d01.show();
    }
}
class Dog01
{
    String name;
    String color;
    int age;
    public Dog01(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show()
    {
        System.out.println(this.name + " " + this.color + " " + this.age);
    }
}
//System.out,println(d1.i);还可以引用属性
//public double method(double d1, double d2)