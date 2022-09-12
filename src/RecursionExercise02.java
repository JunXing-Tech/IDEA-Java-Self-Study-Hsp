public class RecursionExercise02
{
    public static void main(String[] args)
    {
        int sum;
        int day = 1;
        Z p = new Z();
        sum = p.peach(day);
        System.out.println(sum + " ");
    }
}
class Z
{
    public int peach(int day)
    {
        if(day == 10)
            return 1;
        if (day >= 1 && day <= 9)
        {
            return (peach(day + 1) + 1) * 2;
        }
        else
            return -1;
    }
}