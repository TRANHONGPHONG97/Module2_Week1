package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class MergerArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[2];
        int[] arr2 = new int[3];
        System.out.print("mang 1: " + "\n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("phan tu: " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("mang 2: " + "\n");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print("phan tu: " + (j + 1) + ": ");
            arr2[j] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mang gop la: " + Arrays.toString(arr3));
    }
}








