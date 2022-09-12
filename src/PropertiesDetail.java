public class PropertiesDetail
{
    public static void main(String[] args)
    {
        //创建Person对象
        //p1是对象名（对象引用）
        //new Person() 创建的对象空间（数据）才是真正的对象
        Person p1 = new Person();

        System.out.println(p1.age + " " + p1.name + " " + p1.sal + " " + p1.isPass + " ");
    }

}

class Person
{
        int age;
        String name;
        double sal;
        boolean isPass;
}
