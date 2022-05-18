package Exercises;

import java.util.Scanner;

public class BoiChungnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, bcnn;
        System.out.println("Nhap so thu nhat: ");
        number1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        number2 = scanner.nextInt();

        bcnn = (number1 > number1) ? number1 : number2;
        while (true) {
            if (bcnn % number1 == 0 && bcnn % number2 == 0) {
                System.out.println("Boi chung nho nhat la: " + bcnn);
                break;
            }
            bcnn++;
//        }
        }
    }
}
