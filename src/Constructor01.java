public class Constructor01
{
    public static void main(String[] args)
    {
        person2 p2 = new person2("smith", 80);
        System.out.println("输出" + p2.name + p2.age);
    }
}
class person2
{
    String name;
    int age;
    public person2(String pname, int page)
    {
        name = pname;
        age = page;
    }
}