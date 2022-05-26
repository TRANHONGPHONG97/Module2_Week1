package IntroductiontoJava;

import java.util.Scanner;

public class Read_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int number = scanner.nextInt();
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        String result = null;

        if (number < 10) {
            result = one2Nine(third);
            System.out.println(result);
            return;
        }
        System.out.println(number);

        if (number >= 10 && number < 20) {
            result = _10_to_19_(third);
            System.out.println(result);
            return;
        }
        System.out.println(number);
        if (number >= 20 && number < 100) {
            result = _20_to_99_(second);
            System.out.println(result);
            return;
        }
        System.out.println(number);
    }

    public static String _10_to_19_(int number){
        String Special = null;
        switch (number) {
            case 0:
                Special = "Ten";
                break;
            case 1:
                Special = "Eleven";
                break;
            case 2:
                Special = "Twelve";
                break;
            case 3:
                Special = "thirteen";
                break;
            case 4:
                Special = "fourteen";
                break;
            case 5:
                Special = "fifteen";
                break;
            case 6:
                Special = "sixteen";
                break;
            case 7:
                Special = "seventeen";
                break;
            case 8:
                Special = "eighteen";
                break;
            case 9:
                Special = "nineteen";
                break;
        }
        return Special;
    }
    public static String one2Nine(int number) {
        String donviStr = null;
        switch (number) {
            case 0:
                donviStr = "Zero";
                break;
            case 1:
                donviStr = "One";
                break;
            case 3:
                donviStr = "Three";
                break;
            case 4:
                donviStr = "Four";
                break;
            case 5:
                donviStr = "Five";
                break;
            case 6:
                donviStr = "Six";
                break;
            case 7:
                donviStr = "Seven";
                break;
            case 8:
                donviStr = "Eight";
                break;
            case 9:
                donviStr = "Nine";
                break;
        }
        return donviStr;
    }
}



