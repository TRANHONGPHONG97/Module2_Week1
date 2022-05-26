package Exercises;

import java.util.Arrays;

public class InserSort {
    public static void main(String[] args) {
        int arr[] = {3, 8, 1, 9, 4};
//        Arrays.sort(arr);
        InsertionSort So = new InsertionSort();
        So.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}