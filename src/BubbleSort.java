
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 4, 3, 6, 8, 6, 9, 0, 3};
        int i, j, temp = 0;

        for(i = 0; i < arr.length - 1; i++)
        {
            for(j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for(j = 0; j < arr.length; j++)
            {
                System.out.print(arr[j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
