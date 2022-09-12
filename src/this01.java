public class this01
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Tom", 18);
    }
}
class Dog
{
    String name;
    int age;
    public Dog(String name, int age)
    {
        this.name = name;
        this.age  = age;
    }
    public void info()
    {
        System.out.println(this.name + "\t" + this.age);
    }
}