package IntroductiontoJava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        USD = sc.nextDouble();
        double Exchange = USD * 23000;
        System.out.println("Result VND: " + Exchange);
    }
}
