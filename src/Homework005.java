import java.util.Scanner;
public class Homework005
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        Circle cc = new Circle();
        cc.perimeter(r);
        cc.area(r);
    }
}
class Circle
{
    public void perimeter(double r)
    {
        System.out.println("该圆的周长为：" + 2 * Math.PI * r);
    }
    public void area(double r)
    {
        System.out.println("该圆的面积为：" + Math.PI * r * r);
    }
}