package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2, element1, element2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang 1: ");
        size1 = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            element1 = Integer.parseInt(scanner.nextLine());
            arr1[i] = element1;
        }
        System.out.println("Mang 1: " + Arrays.toString(arr1));

        System.out.print("Nhap kich thuoc cua mang 2: ");
        size2 = Integer.parseInt(scanner.nextLine());

        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            element2 = Integer.parseInt(scanner.nextLine());
            arr2[i] = element2;
        }

        System.out.println("Mang 2: " + Arrays.toString(arr2));

        int[] newArr = new int[size1 + size2];

        for (int i = 0; i < size1 + size2; i++) {
            if (i < size1) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - size1];
            }
        }
        System.out.println("Mang sau khi gop la: " + Arrays.toString(newArr));


    }
}

