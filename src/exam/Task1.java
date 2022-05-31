package exercises;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        do {
            System.out.println("Enter n: ");
            n = sc.nextInt();
        }
        while (n == -1);
        if (n > -100) {
            for (i = n; i >= -100; i--) {
                System.out.println(i);
            }
        } else {
            for (i = n; i <= -100; i++) {
                System.out.println(i);
            }
        }
        return;
    }
}
