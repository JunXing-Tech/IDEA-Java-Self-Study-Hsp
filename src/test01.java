
public class test01
{
    public static void main(String[] args)
    {
        Student St = new Student();
        St.name = "小明";
        St.age = 20;
        St.show(St.name, St.age);

        Undergraduate Un = new Undergraduate();
        Un.name = "小周";
        Un.age = 22;
        Un.degree = "机械制造及其自动化";
        Un.show(Un.name, Un.age, Un.degree);
    }
}
class Student
{
    String name;
    int age;
    public void show(String name, int age)
    {
        System.out.println("学生的姓名为:" + name + " 学生的年龄为:" + age);
    }
}
class Undergraduate extends Student
{
    String degree;
    public void show(String name, int age, String degree)
    {
        System.out.println("学生的姓名为:" + name + " 学生的年龄为:" + age + " 学生的专业为:" + degree);
    }
}
