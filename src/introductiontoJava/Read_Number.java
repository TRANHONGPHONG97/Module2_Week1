package introductiontoJava;

import java.util.Scanner;

public class Read_Number {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        number = scanner.nextInt();
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
        if (number >= 20 && number < 100) {
            result = _20_to_99_(second);
            if (third != 0) result += " " + one2Nine(third);
            System.out.println(result);
            return;
        }
        if (number >= 100 && number < 1000) {
            if (third == 0) {
                if (second == 0) {
                    result = _100_to_999_(first);
                    System.out.println(result);
                }
                if (second < 2 && second > 0) {
                    result = _100_to_999_(first) + " " + _10_to_19_(third);
                    System.out.println(result);
                } else if (second >= 2) {
                    result = _100_to_999_(first) + " " + _20_to_99_(second);
                    System.out.println(result);
                }
            } else if (second == 0) {
                result = _100_to_999_(first) + " " + one2Nine(third);
                System.out.println(result);
                return;
            } else if (second < 2) {
                result = _100_to_999_(first) + " " + _10_to_19_(third);
                System.out.println(result);
            } else {
                result = _100_to_999_(first) + " " + _20_to_99_(second) + " " + one2Nine(third);
                System.out.println(result);
            }
            return;
        }
    }

    public static String _100_to_999_(int number) {
        String first = null;
        switch (number) {
            case 1:
                first = "One hundred";
                break;
            case 2:
                first = "Two hundred";
                break;
            case 3:
                first = "Three hundred";
                break;
            case 4:
                first = "Four hundred";
                break;
            case 5:
                first = "Five hundred";
                break;
            case 6:
                first = "Six hundred";
                break;
            case 7:
                first = "Seven hundred";
                break;
            case 8:
                first = "Eight hundred";
                break;
            case 9:
                first = "Nine hundred";
                break;
        }
        return first;
    }

    public static String _20_to_99_(int number) {
        String second = null;
        switch (number) {
            case 2:
                second = "Twenty";
                break;
            case 3:
                second = "Thirty";
                break;
            case 4:
                second = "Forty";
                break;
            case 5:
                second = "Fifty";
                break;
            case 6:
                second = "Sixty";
                break;
            case 7:
                second = "Seventy";
                break;
            case 8:
                second = "Eighty";
                break;
            case 9:
                second = "Ninety";
                break;
        }
        return second;
    }

    public static String _10_to_19_(int number) {
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




