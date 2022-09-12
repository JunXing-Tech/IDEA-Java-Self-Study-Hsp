public class Method
{
     public static void main(String[] args)
    {
        Person01 p1 = new Person01();
        p1.speak();
        p1.cal01();
        p1.cal02(5);
        p1.cal02(10);
        int returnRes = p1.getSum(10, 20);
        System.out.println(returnRes + " ");
    }
}
class Person01
{
    String name;
    int age;
    //成员方法
    //1.public 表示方法公开
    //2.void 无返回值
    //speak（） speak是方法名，（）形参列表
    public void speak()
    {
        System.out.println("123");
    }
    public void cal01()
    {
        int sum = 0;
        for(int i = 1; i <=1000; i++)
        {
            sum += i;
        }
        System.out.println(sum + " ");
    }
    public void cal02(int n)
    {
        int sum = 0;
        for(int i = 1; i <=n; i++)
        {
            sum += i;
        }
        System.out.println(sum + " ");
    }
    public int getSum(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }
}
