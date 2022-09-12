public class YangHui
{
    public static void main(String[] args)
    {
        int i, j;
        int[][] arr = new int[10][];
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = new int[i + 1];
            for(j = 0; j < arr[i].length; j++)
            {
                if(j == 0 || j == arr[i].length - 1)
                    arr[i][j] = 1;
                if(i >= 1 && j > 0 && j < arr[i].length - 1)
                {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for(i = 0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
