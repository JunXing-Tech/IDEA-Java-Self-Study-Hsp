public class Homework001
{
    public static void main(String[] args)
    {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
        A01 a = new A01();
        Double res = a.max(arr);
        if(res != null)
        {
            //实参不需要写数据类型，只需要写数据名
            System.out.println(a.max(arr));
        }
        else
        {
            System.out.println("输入有误");
        }
    }
}
class A01
{
    //形参需要写入数据类型
    public Double max(double[] arr)
    {
        if(arr != null && arr.length > 0)
        {
            int i, num = 0;
            double max = arr[0];
            for (i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
                num = i;
            }
            return arr[num];
        }
        else
            return null;
    }
}