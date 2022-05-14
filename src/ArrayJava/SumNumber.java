package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumber {

    public static void main(String[] args) {
        int size;
        double element;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang 2 chieu: ");
        size = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhap phan tu thu " + i + j + ": ");
                element = Double.parseDouble(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += arr[j][i];
                System.out.println(arr[j][i]);
            }
            System.out.printf("%s%d%s%.2f%n", "Tong cac phan tu o cot ", (i + 1), " la: ", sum);
        }
    }
}
