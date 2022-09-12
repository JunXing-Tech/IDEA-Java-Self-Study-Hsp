public class MethodParameter02
{
    public static void main(String[] args)
    {
        person p = new person();
        p.name = "milan";
        p.age = 100;
        //
        Copyperson c = new Copyperson();
        person p1 = c.copyperson(p);
    }
}
class person //创建类
{
    String name;
    int age;
}

class Copyperson//创建类
{
    public person copyperson(person p)//创建对象
    {
        person p1 = new person();//引用person类
        p1.name = p.name;
        p1.age = p.age;
        return p1;
    }
}
