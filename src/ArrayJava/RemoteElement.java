package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class RemoteElement {
    public static void main(String[] args) {
        int size, element, number, index = 0, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số phần tử của mảng (nhập -1 để thoát): ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 1) {
                int[] arr = new int[size];
                for (int j = 0; j < size; j++) {
                    System.out.println("Nhập phần tử thứ " + (j + 1) + " : ");
                    element = Integer.parseInt(scanner.nextLine());
                    arr[j] = element;
                }
                System.out.println(Arrays.toString(arr));

                System.out.print("Nhập phần tử xóa: ");
                number = Integer.parseInt(scanner.nextLine());
                System.out.println(number);

                for (i = 0; i < size; i++) {
                    if (arr[i] == number) {
                        index = i;
                        break;
                    }
                }

                System.out.println(index);

                if (i == size) {
                    System.out.println("Không tồn tại " + number + " trong mảng!");
                    System.out.println(Arrays.toString(arr));
                }

                int[] newarr = new int[size - 1];
                for (int k = 0, l = 0; k < size; k++) {
                    if (k == index) {
                        continue;
                    }
                    newarr[l] = arr[k];
                    l++;
                }

                System.out.println(Arrays.toString(newarr));
            } else if (size < 1 && size != -1) {
                System.out.println("Nhập số lượng phần tử thích hợp!");
            }
        } while (size != -1);


    }
}

