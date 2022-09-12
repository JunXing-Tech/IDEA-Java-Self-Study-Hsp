public class Homework004
{
    public static void main(String[] args)
    {
        //雷后要加上括号，不要忘记
        A03 a03 = new A03();
        int[] OldArr = {1, 2, 3, 4, 5};
        int[] NewArr = a03.CopyArr(OldArr);
        for(int i = 0; i < NewArr.length; i++)
        {
            System.out.print(NewArr[i] + " ");
        }
    }
}
/*
分析
*/
class A03
{
    //在方法中，数组也可作为数据类型并return返回
    public int[] CopyArr(int[] OldArr)
    {
        //此处的NewArr数组为局部变量
        int[] NewArr = new int[OldArr.length];
        for(int i = 0; i < OldArr.length; i++)
        {
            NewArr[i] = OldArr[i];
        }
        return NewArr;
    }
}