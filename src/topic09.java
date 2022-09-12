public class topic09
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 1;
        int sum = 0;
        for(i  = 1; i <= 100; i++)
        {
            for(j = 1; j <= i; j++)
            {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
