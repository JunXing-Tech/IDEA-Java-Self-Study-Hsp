public class ConstructorExercise
{
    public static void main(String[] args)
    {
        Person4 p1 = new Person4();
        Person4 p2 = new Person4("tom", 18);
    }
}
class Person4
{
    String name;
    int age;
    public Person4()
    {
        age = 18;
    }
    public Person4(String pName, int pAge)
    {
        name = pName;
        age = pAge;
    }
}