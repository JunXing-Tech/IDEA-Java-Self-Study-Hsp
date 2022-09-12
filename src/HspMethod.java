public class HspMethod
{
    public static void main(String[] args)
    {
        showcase sc = new showcase();
        sc.ng("小明", 90, 80);
        sc.ng("小红", 90, 80, 70);
        sc.ng("小曾",100, 100, 100, 100, 100);
    }
}
class showcase
{
    public void ng(String name, int... grade)
    {
        int sum = 0;
        for(int i = 0; i < grade.length; i++)
        {
            sum += grade[i];
        }
        System.out.println("姓名:" + name + " " + grade.length + "门总分为:" + sum);
    }
}