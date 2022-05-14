package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonal_line {
    public static void main(String[] args) {
        int size;
        double element;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang 2 chieu: ");
        size = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhap phan tu thu " + i + j + ": ");
                element = Double.parseDouble(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tong cua duong cheo chinh la: " + sum);
    }
}

