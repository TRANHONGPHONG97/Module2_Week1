package Loop;

import java.util.Scanner;

public class IsPrime20 {
    public static void main(String[] args) {
        int number, count = 1, n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in:\t");
        number = Integer.parseInt(scanner.nextLine());

        while (count <= number) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d\t", n);
                count++;
            }
            n++;
        }

    }
}
