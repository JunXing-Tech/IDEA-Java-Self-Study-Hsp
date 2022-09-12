public class VarScopeDetail
{
    public static void main(String[] args)
    {
        Person1 p1 = new Person1();

        T1 t1 = new T1();
        t1.test();
        t1.test2(p1);
    }
}
class T1
{
    public void test()
    {
        Person1 p1 = new Person1();
        System.out.println(p1.name);
    }
    public void test2(Person1 p1)
    {
        System.out.println(p1.name);
    }
}
class Person1
{
    //属性和全局变量可以加修饰符
    public int age = 20;
    String name = "jack";

    public void say()
    {
        String name = "King";
        System.out.println("say() name=" + name);
    }
    public void hi()
    {
        String address = "北京";
        String name = "hsp";
    }
}
