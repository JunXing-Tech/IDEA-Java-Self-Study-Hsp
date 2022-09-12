public class topic08
{
    public static void main(String[] args)
    {
        double j = 0.0;
        for(int i = 1;i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                j -= 1.0 / i;
            }
            else
            {
                j += 1.0 / i;
            }
        }
        System.out.println(j);
    }
}
