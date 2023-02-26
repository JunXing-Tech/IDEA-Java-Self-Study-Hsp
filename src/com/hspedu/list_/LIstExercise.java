package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JunXing
 * 2023/2/25 9:04
 * IntelliJ IDEA
 */
public class LIstExercise {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add("0" + i);
        }

        list.add(1, "hsp");

        System.out.println(list.get(4));

        list.remove(5);

        list.set(0, "zjx");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
