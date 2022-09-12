import java.util.Scanner;
public class Homework003
{
    public static void main(String[] args)
    {
        //Scanner price = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        Book book = new Book();
        System.out.println(book.updatePrice(price));
    }
}
class Book
{
    public int updatePrice(int price)
    {
        if(price > 150)
            price = 150;
        else if(price > 100)
            price = 100;
        return price;
    }
}
/*import java.util.Scanner;
Scanner input = new Scanner(System.in);
int price = input.nextInt();
float price = input.nextFloat();
double price = input.nextDouble();
String price = input.next();
 */