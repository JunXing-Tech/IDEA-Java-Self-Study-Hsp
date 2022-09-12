import java.util.Scanner;
public class RecurisonExercise010
{
    public static void main(String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        int num = myscanner.nextInt();
        T01 f = new T01();
        int sum = f.fibonacci(num);
        System.out.println(sum + " ");
    }
}
class T01
{
    public int fibonacci(int n)
    {
        if(n >= 1)
        {
            if (n == 1 || n == 2)
                return 1;
            else
            {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        else
            return -1;
    }
}
