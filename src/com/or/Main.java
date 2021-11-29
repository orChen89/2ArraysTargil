package com.or;

import java.util.Arrays;

public class Main {

       public static void main(String[] args) {

      printArr(Arr());

    }

    public static void printArr(int[] newArr) {

        System.out.println(Arrays.toString(newArr));
    }

    public static int[] Arr() {

        int[] arr = {5, 3, 9, 6, -8};
        int[] arr2 = {1, 9, 3, 14, 10};
        int[] newArr = new int[arr.length + arr2.length];
        boolean b1[] = new boolean[arr.length];
        boolean b2[] = new boolean[arr2.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    b1[i] = true;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr[j]) {
                    b2[i] = true;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < b1.length; i++) {
           if (!b1[i]) {
           newArr[counter] = arr[i];
               counter++;
           }
        }
        for (int i = 0; i < b2.length; i++) {
            if (!b2[i]) {
                newArr[counter++] = arr2[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] == 0){
                newArr[i] = -99;
            }
        }
        return newArr;
    }
}


