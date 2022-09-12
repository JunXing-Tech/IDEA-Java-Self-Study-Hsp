import java.util.Scanner;
public class HomeWork04
{
    public static void main(String[] args)
    {
        int i, temp;
        int arr01[] = {10, 12, 45, 90};
        int arr02[] = new int[arr01.length + 1];
        for(i = 0; i < arr01.length; i++)
        {
            arr02[i]  = arr01[i];
        }
        Scanner myscanner = new Scanner(System.in);
        System.out.print("PLease input your number: ");
        int num = myscanner.nextInt();
        for(i = arr01.length - 1; i >= 0; i--)
        {
            if(num < arr02[i])
            {
                arr02[i + 1] = arr02[i];
            }
            else if(num >= arr02[i])
            {
                arr02[i + 1] = num;
                break;
            }
        }
        arr01 = arr02;
        for(i = 0; i < arr01.length; i++)
        {
            System.out.print(arr01[i] + " ");
        }
    }
}
