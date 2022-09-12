public class TestPerson
{
    /*
    定义 Person 类，里面有 name、age 属性，并提供 compareTo 比较方法，
    用于判断是否和另一个人相等，提供测试类 TestPerson
    用于测试, 名字和年龄完全一样，就返回 true, 否则返回 fals
     */
    public static void main(String[] args)
    {
        Person5 p5 = new Person5("Tom", 20);
        Person5 p6 = new Person5("smith", 30);
        System.out.println(p5.compareTo(p6));
    }
}
class Person5
{
    String name;
    int age;

    public Person5(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person5 p6)
    {
        return this.name.equals(p6.name) && this.age == p6.age;
    }
}