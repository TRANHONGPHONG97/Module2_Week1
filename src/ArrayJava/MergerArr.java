package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class MergerArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[2];
        int[] arr2 = new int[3];

        System.out.print("mang 1: " + "\n");
        int k = 0;
        while (k < arr1.length) {
            System.out.print("phan tu: " + (k + 1) + ": ");
            arr1[k] = scanner.nextInt();
            k++;
        }
        int j = 0;
        System.out.print("mang 2: " + "\n");
        while (j < arr2.length) {
            System.out.print("phan tu: " + (j + 1) + ": ");
            arr2[j] = scanner.nextInt();
            j++;
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("Mang gop la: " + Arrays.toString(arr3));
    }
}








