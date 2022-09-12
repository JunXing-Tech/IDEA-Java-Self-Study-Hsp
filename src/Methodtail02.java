public class Methodtail02
{
    public static void main(String[] args)
    {
        A a = new A();
        a.sayOK();
        a.m1();
    }
}
class A
{
    public void print(int n)
    {
        System.out.println(" " + n);
    }
    public void sayOK()
    {
        print(10);
        System.out.println("123");
    }
    public void m1()
    {
        B b = new B();
        b.hi();
    }
}
class B
{
    public void hi()
    {
        System.out.println(456 + "");
    }
}
