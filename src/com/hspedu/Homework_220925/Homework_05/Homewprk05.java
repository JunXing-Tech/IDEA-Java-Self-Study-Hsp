package com.hspedu.Homework_220925.Homework_05;

public class Homewprk05 {
    public static void main(String[] args) {
        Worker worker = new Worker(20000);
        Peasant peasant = new Peasant(10000);
        Teacher teacher = new Teacher(7000, 365, 20);
        Scientist scientist = new Scientist(30000, 20000);
        Waiter waiter = new Waiter(150000);

        System.out.println("Worker= " + worker.year_sal());
        System.out.println("Peasant= " + peasant.year_sal());
        System.out.println("Teacher= " + teacher.year_sal());
        System.out.println("Scientist= " + scientist.year_sal());
        System.out.println("Waiter= " + waiter.year_sal());

    }
}
