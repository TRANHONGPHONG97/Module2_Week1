
package Exercises;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        boolean isRetry;

        do {
            int expectedAnswer = input.nextInt();
            isRetry = number1 + number2 != expectedAnswer;
            if (isRetry)
                System.out.println("false");
        }
        while (isRetry);
        System.out.println("true");
    }
}