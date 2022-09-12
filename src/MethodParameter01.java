public class MethodParameter01
{
    public static void main(String[] args)
    {
        B01 b = new B01();
        int[] arr = {1, 2, 3};
        b.test100(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        Person02 p = new Person02();
        p.name = "jack";
        p.age = 10;
        b.test200(p);
        System.out.println(p.age + " ");
    }
}
class Person02
{
    String name;
    int age;
}
class B01
{
    public void test200(Person02 p)
    {
        p.age = 10000;
    }

    public void test100(int[] arr)
    {
        arr[0] = 200;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
