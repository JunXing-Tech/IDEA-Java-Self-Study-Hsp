public class ThisDetail
{
    public static void main(String[] args)
    {
        T2 t2 = new T2();
        t2.f2();
    }
}
class T2

{
    //使用this访问构造器
    public T2()//无参构造器
    {
        //只能在构造器中使用this语法去访问另外一个构造器
        //在使用this访问同一个类的其他构造器时
        //必须把this语句放在构造器的第一条语句
        this("name", 10);
        System.out.println("T2()");
    }
    public T2(String name, int age)
    {
        System.out.println("T2(String name, int age)");
    }
    //使用this访问成员方法
    public void f1()
    {
        System.out.println("f1()");
    }
    public void f2()
    {
        System.out.println("f2()");
        //调用本类f1
        //1.
        f1();
        //2.
        this.f1();
    }
}