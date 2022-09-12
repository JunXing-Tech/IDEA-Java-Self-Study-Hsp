public class Homework006
{
    public static void main(String[] args)
    {
        cale ca = new cale(2, 0);
        System.out.println(ca.add());
        System.out.println(ca.min());
        System.out.println(ca.mul());
        Double res = ca.div();
        if(res != null)
        {
            System.out.println(ca.div());
        }
        else
        {
            System.out.println("除数为0");
        }
    }
}
class cale
{
    double num1;
    double num2;
    public cale(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add()
    {
        return num1 + num2;
    }
    public double min()
    {
        return num1 - num2;
    }
    public double mul()
    {
        return num1 * num2;
    }
    //应考虑健壮性，解决当除数为0时的情况
    public Double div()
    {
        if(num2 != 0)
        {
            return num1 / num2;
        }
        else
        {
            return null;
        }
    }

}