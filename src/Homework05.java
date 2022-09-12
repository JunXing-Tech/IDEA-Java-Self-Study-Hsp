public class Homework05
{
    public static void main(String[] args)
    {
        int i, j, max, min;
        int temp, sum = 0;
        int index1 = 0, index2 = 0;
        int arr[] = new int[10];
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
            sum += arr[i];
        }
        System.out.println("平均数为：" + sum / arr.length);

        System.out.print("随机数为：");
        for(i = 0;i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i = 0, j = arr.length - 1; i < j; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("倒序数为：");
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        max = arr[0];
        for(i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                index1 = i;
            }
        }
        System.out.println("最大值数的下标为：" + index1);

        min = arr[0];
        for(i = 0; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
                index2 = i;
            }
        }
        System.out.println("最小值数的下标为：" + index2);
    }
}
