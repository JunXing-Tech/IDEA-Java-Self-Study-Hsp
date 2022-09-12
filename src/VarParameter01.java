public class VarParameter01
{
    public static void main(String[] args)
    {
        Method01 m = new Method01();
        m.sum();
    }
}
class Method01
{
    //使用可变参数
    //方法名称相同，功能相同，参数个数不同
    //使用可变参数时，可以当作数组来使用,即nums可以当作数组
    //遍历nums求和即可
    public int sum(int... nums)
    {
        System.out.println("接收的参数个数为：" + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            res += nums[i];
        }
        return 0;
    }
}