package arrayJava;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, min, element;
        System.out.println("Nhap kich thuoc mang: ");
        size = scanner.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1) + ":");
            element = scanner.nextInt();
            arr[i] = element;
        }
        min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min < arr[i])
                min = arr[i];
        }
        System.out.println("So be nhat la: " + min);
    }
}
