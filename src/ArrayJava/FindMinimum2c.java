package ArrayJava;

import java.util.Scanner;

public class FindMinimum2c {
    public static void main(String[] args) {
        double element, min;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        size = Integer.parseInt(scanner.nextLine());

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan thu thu " + (i + 1) + ": ");
            element = Double.parseDouble(scanner.nextLine());
            arr[i] = element;
        }

        min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Gia tri phan tu nho nhat trong mang la: " + min);
    }
}
