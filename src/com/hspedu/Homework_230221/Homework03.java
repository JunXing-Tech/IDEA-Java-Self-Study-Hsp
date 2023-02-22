package com.hspedu.Homework_230221;

import java.util.Scanner;

/**
 * JunXing
 * 2023/2/22 15:05
 * IntelliJ IDEA
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        printName(Name);
    }

    public static void printName(String Name){
        if(Name == null){
            return;
        }

        String[] names = Name.split(" ");
        if(names.length != 3){
            return;
        }

        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
