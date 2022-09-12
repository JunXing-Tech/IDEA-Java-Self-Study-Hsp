public class OverLoadExercise01
{
    public static void main(String[] args)
    {
        num_max m = new num_max();
        m.max(5 , 6);
        m.max(5.5, 6.6);
        m.max(5.5, 6.6, 7.7);
    }
}
class num_max
{
    public void max(int n1, int n2)
    {
        if(n1 > n2)
        System.out.println("max = " + n1);
        if(n1 < n2)
            System.out.println("max = " + n2);
        else
            System.out.println("n1 = n2");
        //return n1 > n2 ? n1 : n2;
    }
    public void max(double n1, double n2)
    {
        if(n1 > n2)
            System.out.println("max = " + n1);
        if(n1 < n2)
            System.out.println("max = " + n2);
        else
            System.out.println("n1 = n2");
        //return n1 > n2 ? n1 : n2;
    }
    public void max(double n1, double n2, double n3)
    {
        if(n1 > n2 && n1 > n3)
            System.out.println("max = " + n1);
        if(n2 > n1 && n2 > n3)
            System.out.println("max = " + n2);
        if(n3 > n1 && n3 > n2)
            System.out.println("max = " + n3);
        //double max = n1 > n2 ? n1 : n2;
        //return max > n3 ? max : n3;
    }

}
