package exam;

import java.util.Scanner;

public class Tes1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so can doc(0-999)(Nhap -1 de ket thuc):");
            number = Integer.parseInt(scanner.nextLine());

            int firstDigit = number / 100;
            int secondDigit = number % 100 / 10;
            int thirdDigit = number % 10;
            int status = number < 0 ? 1 : number < 20 ? 2 : number < 100 ? 3 : number < 1000 ? 4 : 5;

            String first = "", second = "", third = "";


            switch (firstDigit) {
                case 1:
                    first = "One";
                    break;
                case 2:
                    first = "Two";
                    break;
                case 3:
                    first = "Three";
                    break;
                case 4:
                    first = "Four";
                    break;
                case 5:
                    first = "Five";
                    break;
                case 6:
                    first = "Six";
                    break;
                case 7:
                    first = "Seven";
                    break;
                case 8:
                    first = "Eight";
                    break;
                case 9:
                    first = "Nine";
                    break;
            }

            switch (secondDigit) {
                case 1:
                    switch (thirdDigit) {
                        case 0:
                            third = "ten";
                            break;
                        case 1:
                            third = "eleven";
                            break;
                        case 2:
                            third = "twelve";
                            break;
                        case 3:
                            third = "thirteen";
                            break;
                        case 4:
                            third = "fourteen";
                            break;
                        case 5:
                            third = "fifteen";
                            break;
                        case 6:
                            third = "sixteen";
                            break;
                        case 7:
                            third = "seventeen";
                            break;
                        case 8:
                            third = "eighteen";
                            break;
                        case 9:
                            third = "nineteen";
                            break;
                    }
                case 2:
                    second = "twenty";
                    break;
                case 3:
                    second = "thirty";
                    break;
                case 4:
                    second = "forty";
                    break;
                case 5:
                    second = "fifty";
                    break;
                case 6:
                    second = "sixty";
                    break;
                case 7:
                    second = "seventy";
                    break;
                case 8:
                    second = "eighty";
                    break;
                case 9:
                    second = "ninety";
                    break;
            }

            if(secondDigit != 1) {
                switch (thirdDigit) {
                    case 0:
                        third = "";
                        break;
                    case 1:
                        third = "one";
                        break;
                    case 2:
                        third = "two";
                        break;
                    case 3:
                        third = "three";
                        break;
                    case 4:
                        third = "four";
                        break;
                    case 5:
                        third = "five";
                        break;
                    case 6:
                        third = "six";
                        break;
                    case 7:
                        third = "seven";
                        break;
                    case 8:
                        third = "eight";
                        break;
                    case 9:
                        third = "nine";
                        break;
                }
            }

            switch (status) {
                case 1:
                    System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
                    break;
                case 2:
                    System.out.println(third);
                    break;
                case 3:
                    System.out.println(second + '-' + third);
                    break;
                case 4:
                    if (secondDigit == 0) {
                        if (thirdDigit == 0) {
                            System.out.println(first + " hundred ");
                        } else {
                            System.out.println(first + " hundred and " + third);
                        }
                    } else {
                        if (secondDigit == 1) {
                            System.out.println(first + " hundred and " + third);
                        } else {
                            System.out.println(first + " hundred and " + second + '-' + third);
                        }
                    }
                    break;
                default:
                    System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
                    break;
            }
        } while (number != -1);

    }
}
