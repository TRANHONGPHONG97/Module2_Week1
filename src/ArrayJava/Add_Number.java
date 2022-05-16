package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Number {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu them: ");
        int x = scanner.nextInt();
        System.out.print("nhap vi tri them: ");
        int index = scanner.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (index <= -1 && index >= array.length - 1)
                System.out.println("khong chen duoc phan tu vao mang!");
            else {
                array[index] = x;
            }
        }
        System.out.println("mang sau khi them la: " + Arrays.toString(array));
    }
}

