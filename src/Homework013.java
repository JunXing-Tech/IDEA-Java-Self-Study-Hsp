
public class Homework013
{
    public static void main(String[] args)
    {
        Circle01 c01 = new Circle01();
        PassObject po = new PassObject();
        po.printAreas(c01, 5);
    }
}
class Circle01
{
    double radius;
    public double FindAreas()
    {
        return Math.PI * radius * radius;
    }
    public void SetRadius(double radius)
    {
        this.radius = radius;
    }
}
class PassObject
{
    //在一个类方法中调用另一个类方法有2点需要注意
    //1.在类方法的形参中需要把另一个类名写入形参中，如下文中的“Circle01 c”
    //2.在类方法中可用另一类的类名所代表的名称加上“.”连接需要调用的方法名，如下文中的“c.SetRadius()”
    public void printAreas(Circle01 c, int times)
    {
        System.out.println("radius\tAreas");
        for(int i = 1; i < times; i++)
        {
            c.SetRadius(i);
            System.out.println((double)i + "\t\t" + c.FindAreas());
        }
    }
}