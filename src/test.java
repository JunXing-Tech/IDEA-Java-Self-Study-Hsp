import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        /*
        int[] arr1 = {10};
        int[] arr2 = new int[arr1.length];
        */
        /*
        int[] arr = {11, 22, 33, 44, 55, 66};
        int i ,temp;
        for(i = 0 ; i < arr.length / 2; i++)
        {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        */
        /*
        int arr[] = {11, 22, 33, 44 ,55 ,66};
        int arr2[] = new int[arr.length];
        int i, j;
        for(i = arr.length - 1, j = 0; i >=0; i--, j++)
        {
            arr2[j] = arr[i];
        }
        //当arr指向arr2数据空间时， 此时arr原来的数据空间就没有变量引用，会被垃圾销毁
        arr = arr2;
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        */
        T t1 = new T();
        t1.test(4);
    }
}
class T
{
    public void test(int n)
    {
        if(n > 2)
            test(n - 1);
        else
            System.out.println("n =" + n);
    }
}

