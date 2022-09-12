public class OverLoadExercise
{
    public static void main(String[] args)
    {
        M m = new M();
        System.out.println(m.method(5));
        System.out.println(m.method(5, 6));
        m.method("zjx");

    }
}
class M
{
    public int method(int n1)
    {
        return n1 * n1;
    }
    public int method(int n1, int n2)
    {
        return n1 + n2;
    }
    public void method(String n1)
    {
        System.out.println(n1);
    }

}
