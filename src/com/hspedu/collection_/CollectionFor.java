package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JunXing
 * 2023/2/23 11:33
 * IntelliJ IDEA
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new BOOK("sgyy", "lgz"));
        col.add(new BOOK("hlm", "cxq"));

        /**
         * 增强for循环
         */
        for(Object book : col){
            System.out.println(book);
        }

        int[] nums = {1, 2, 3};
        for (int i: nums) {
            System.out.println(i);
        }
    }
}
