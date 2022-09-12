public class MIGong
{
    public static void main(String[] args)
    {
        //思考
        //函数递归回溯
        //思路
        //1.二维数组 创建迷宫
        //2.0 可走 1 不可走
        //3.最上和最下行设为0
        int [][] map = new int [8][7];
        for(int i = 0; i < 7; i++)
        {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int i = 0; i < 8; i++)
        {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("===迷宫初始情况===");
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        gong G = new gong();
        G.findway(map, 1, 1);
        System.out.println("===迷宫完成情况===");
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class gong
{
    //找路函数findway
    //思路
    //递归思想解决迷宫问题
    //1、可以通过给值是0的数组值赋值来表示迷宫是否可以走
    //2、0可走（前提），1不可走，2可走，3走不通
    //3、设置走迷宫的方向的优先级，下，右，左，上
    //4、通过主函数来设置点的初始值，为1，1
    public boolean findway(int [][] map, int i, int j)
    {   //伪代码
        //递归终止条件，map[6][5] == 2表示已到达终点，则递归退出（也无递归函数的使用）
        if (map[6][5] == 2) {
            return true;
        }
        //递归开始
        else
        {
            //递归循环的条件，判断下次移动的点是否满足为0（无障碍）
            if (map[i][j] == 0) {
                //假设该点可以走通，为2
                map[i][j] = 2;
                //设置方向优先级（递归实现）, 记得是 if else，如果-否则如果
                //下
                if (findway(map, i + 1, j)) {
                    return true;
                }
                //右
                else if (findway(map, i, j + 1)) {
                    return true;
                }
                //左
                else if (findway(map, i, j - 1)) {
                    return true;
                }
                //上
                else if (findway(map, i - 1, j)) {
                    return true;
                }
                //以上4种情况都走不通的情况，需要一个else, 并给该点赋值为3，且返回false
                else {
                    map[i][j] = 3;
                    return false;
                }
            }
            //else和if匹配,考虑的是往回走的情况，如果往回走，那么上一步的值已被标为2，
            //如果值为2，那么不执行第一个递归（下），将会执行第二个递归，以此类推，主要的目的就是避免往回走，避免死循环
            else
            {
                return false;
            }
        }
    }
}