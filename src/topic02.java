import java.util.Scanner;
public class topic02
{
    public static void main(String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        int number = myscanner.nextInt();
        int number01 = number / 100;
        int a = number01 * number01 * number01;
        int number02 = number / 10 % 10;
        int b = number02 * number02 * number02;
        int number03 = number % 10;
        int c = number03 * number03 * number03;
        if(number == a + b + c)
            System.out.println("yes");
    }
}
