public class Homework0003
{
    public static void main(String[] args)
    {
        Book01 b01 = new Book01("笑傲江湖", 300);
        b01.info();
        //更新价格
        b01.updatePrice();
        b01.info();
    }
}
//分析
class Book01
{
    String name;
    double price;
    public Book01(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public void updatePrice()
    {
        if(price > 150)
            price = 150;
        else if(price > 100)
            price = 100;
    }
    public void info()
    {
        System.out.println("书名=" + this.name + "价格=" + this.price);
    }
}