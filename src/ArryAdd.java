import java.util.Scanner;
public class ArryAdd {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};
        int arrNew[] = new int[arr.length + 1];

        Scanner myscanner = new Scanner(System.in);
        int num = myscanner.nextInt();
        int i;
        for(i = 0; i < arr.length; i++)
        {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
    }
}
