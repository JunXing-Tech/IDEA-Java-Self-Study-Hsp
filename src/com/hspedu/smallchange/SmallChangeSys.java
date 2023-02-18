package com.hspedu.smallchange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sel_num;
        //设置do—while的参数，假定初始为真，方便在退出时修改并退出do-while循环
        boolean loop = true;
        //完成零钱通明细
        String details = "--------------------零钱通明细--------------------";
        //完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;//data是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //完成消费说明
        String note = "";

        //菜单项目适合用do-while循环，因为菜单项目必要使用一次
        do {
            System.out.println("\n--------------------零钱通菜单--------------------");
            System.out.println("                1.零钱通明细");
            System.out.println("                2.收益明细");
            System.out.println("                3.消费");
            System.out.println("                4.退出");
            System.out.print("请选择选线(1-4):");
            sel_num = scanner.nextInt();
            //分级菜单适合使用switch结构 switch(){case: default}
            switch(sel_num){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("--------------------收益入账--------------------");
                    money =scanner.nextDouble();//money范围设置
                    if(money <= 0){//判断金额是否合法
                        System.out.println("金额输入有误，请重新输入");
                        break;
                    }
                    balance += money;
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 3:
                    System.out.print("消费金额");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance){
                        System.out.println("金额输入有误,请重新输入");
                        break;
                    }
                    System.out.print("消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 4:
                    String choice = "";
                    while(true){
                        System.out.println("退出? y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop = false;//如为4，则修改loop值为false，并退出循环
                    }
                    break;
                default:
                    System.out.println("输入数字有误，请重新输入");
                    break;
            }
        }while(loop);
        System.out.println("您已退出零钱通程序");
    }
}
