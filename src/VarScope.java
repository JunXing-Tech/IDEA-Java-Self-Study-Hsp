public class VarScope
{
    public static void main(String[] args)
    {

    }
}
class Cat
{
    int age = 10;
    double weight;

    public void hi()
    {
        int num = 1;
        String address = "Beijing";
        System.out.println("num=" + num);
        System.out.println("address=" + address);
        System.out.println("weight=" + weight);
    }
    public void cry()
    {
        int n = 10;
        String name = "jack";
        System.out.println("cry age=" + age);
    }
    public void eat()
    {
        System.out.println("eat age=" + age);
    }
}