package arrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumberOfCol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap phan tu thu " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[j][i];
            }
            System.out.println("Tổng các sô ở cột là: " +sum);
        }
    }
}
