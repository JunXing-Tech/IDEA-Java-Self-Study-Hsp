public class Homework002
{
    public static void main(String[] args)
    {
        String[] arr = {"123", "456", "789"};
        A02 a02 = new A02();
        System.out.println(a02.find(arr));
    }
}
class A02
{
    public int find(String[] arr)
    {
        //最外对括号内要有return语句
        int i;
        String str = "456";
        for(i = 0; i < arr.length; i++)
        {
            if(str.equals(arr[i]))
            {
                return  i + 1;
            }
        }

        return -1;
    }
}