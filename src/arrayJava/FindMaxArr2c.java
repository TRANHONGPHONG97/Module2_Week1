package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxArr2c {
    public static void main(String[] args) {
        int size, element, max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang 2 chieu: ");
        size = scanner.nextInt();

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhap phan tu o tri vi " + i + j + ": ");
                element = scanner.nextInt();
                arr[i][j] = element;
            }
        }

        max = arr[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Mang 2 chieu la: " + Arrays.deepToString(arr));
        System.out.println("Gia tri lon nhat trong mang 2 chieu la: " + max);
    }
}
