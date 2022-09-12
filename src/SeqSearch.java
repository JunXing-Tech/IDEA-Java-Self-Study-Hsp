import java.util.Scanner;
public class SeqSearch
{
    public static void main(String[] args)
    {
        String [] arr = {"123","456","789"};
        Scanner myscanner = new Scanner(System.in);
        String findstring = myscanner.next();

        int i ,index = 0;
        for(i = 0; i < arr.length; i++)
        {
            if(findstring.equals(arr[i]))
            {
                System.out.println("找到为：" + arr[i] + "，并且下标为：" + i);
            }
            index = 1;
        }
        if(index == 0)
        {
            System.out.println("无法查找到");
        }
    }
}
