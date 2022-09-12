import java.util.Random;
public class Homework014
{
    public static void main(String[] args)
    {
        random_num rn = new random_num();
        print_checklist pc = new print_checklist();
        pc.checklist(rn, 3);
    }
}
/*
分析
1.产生tom的随机数与电脑的随机数
2.猜拳的次数
 */
class random_num
{
    //产生0-2的随机数
    //tom的随机数
    public int num_tom()
    {
        Random r = new Random();
        int n = r.nextInt(3);
        return n;
    }
    //电脑的随机数
    public int num_com()
    {
        Random r = new Random();
        int n = r.nextInt(3);
        return n;
    }
}
class print_checklist
{
    public void checklist(random_num rn , int num)
    {
        int index = 0;
        int res = 0;
        System.out.println();
        for(int i = 1; i <= num; i++)
        {

            int t = rn.num_tom();
            int c = rn.num_com();
            System.out.println("第" + i + "次猜拳:tom为" + t + "电脑为" + c);
            if(t == 0 && c == 1)
            {
                index++;
            }
            else if(t == 1 && c == 2)
            {
                index++;
            }
            else if(t == 2 && c == 0)
            {
                index++;
            }
            else if(t == c)
            {
                res++;
            }
        }
        int res01 = num - index - res;
        System.out.println("tom赢" + index + "电脑赢" + res01);
    }
}