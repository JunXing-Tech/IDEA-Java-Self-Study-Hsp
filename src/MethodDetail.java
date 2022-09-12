public class MethodDetail
{
    public static void main(String[] args)
    {
        AA aa = new AA();
        int [] res = aa.getSumAndSub(1, 4);
        System.out.println(res[0] + " ");
        System.out.println(res[1] + " ");
    }
}
class AA
{
    public int[] getSumAndSub(int n1, int n2)
    {
        int [] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        return res; //返回数组是返回方法内的数组名
    }
}
