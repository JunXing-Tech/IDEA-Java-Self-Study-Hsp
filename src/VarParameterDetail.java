public class VarParameterDetail
{
    public static void main(String[] args)
    {
        //可变参数的实参可以为数组
        int[] arr = {1, 2, 3};
        VarPD pd = new VarPD();
        pd.var(arr);
    }
}
class VarPD
{
    public void var(int... nums)
    {
        System.out.println("可变参数的长度为:" + nums.length);
    }
    //细节：可变参数可以和莆普通类型的参数一起放在形参列表，但是要保证可变参数在最后
    public void var01(double d1, double... d2)
    {

    }

}
