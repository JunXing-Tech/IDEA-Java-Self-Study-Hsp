import java.util.Scanner;
public class MethodExercise01
{
    public static void main(String[] args)
    {
        int n;
        Scanner myscanner = new Scanner(System.in);
        n = myscanner.nextInt();
        AA01 aa01 = new AA01();
        boolean i = aa01.isNumber(n);
        System.out.println("该数是否是偶数:" + i);
    }
}

class AA01
{
    public boolean isNumber(int n)
    {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
}