package exercises;

import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tim: ");
        int x = scanner.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Vi tri so do la: " +i);
                i++;
            }
        }
        System.out.println("So khong co trong mang!");
    }
}


