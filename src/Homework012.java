public class Homework012
{
    public static void main(String[] args) {

    }
}
class Employee
{
    String name;
    char sex;
    int age;
    String z;
    double salary;

    public Employee(String name, char sex, int age, String z, double salary)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.z = z;
        this.salary = salary;
    }
    public Employee(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee( String z, double salary)
    {
        this.z = z;
        this.salary = salary;
    }
}