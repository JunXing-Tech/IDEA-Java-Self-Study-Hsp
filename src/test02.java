import java.util.ArrayList;
import java.util.Iterator;
public class test02
{
    public static void main(String[] args)
    {
        ArrayList<String> num = new ArrayList<String>();
        num.add("11");
        num.add("22");
        num.add("33");
        num.add("44");
        num.add("55");
        num.add("66");
        num.add("77");
        num.add("88");
        num.add("99");
        num.add("100");

        Iterator<String> it = num.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


