public class ConstructorDetail
{
    public static void main(String[] args)
    {
        Person3 p1 = new Person3("tom", 30);
        Person3 p2 = new Person3("king");
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Person3
{
    String name;
    int age;
    //构造器的重载
    public Person3(String pname, int page)
    {
        name = pname;
        age = page;
        System.out.println(name + " " +age);
    }
    public Person3(String pname)
    {
        name= pname;
        System.out.println(name);
    }
}