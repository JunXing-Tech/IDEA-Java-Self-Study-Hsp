package com.hspedu;

import java.util.Arrays;

public class Import01
{
    public static void main(String[] args) {
        int[] arr = {-1, 0, 5, 3, 20};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
