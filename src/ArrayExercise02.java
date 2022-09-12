public class ArrayExercise02
{
    public static void main(String[] args)
    {
        int a1[] = {4, -1, 900, 100, 230};
        int max;
        int num = 0;
        max = a1[0];
        int i;
        for(i = 0; i < a1.length; i++)
        {
            if(max <= a1[i])
            {
                max = a1[i];
                num = i + 1;
            }
        }
        System.out.println(max + " " + num + "");
    }
}
