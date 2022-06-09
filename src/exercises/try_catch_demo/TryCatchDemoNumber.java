package exercises.try_catch_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Number1: ");
            int number1 = scanner.nextInt();
            System.out.println("Number2: ");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
    }
}
