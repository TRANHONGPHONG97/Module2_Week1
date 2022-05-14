package ArrayJava;
import java.util.Arrays;
import java.util.Scanner;
    public class AddElement {
        public static void main(String[] args) {
            int size, element, number, index;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Nhap số phan tu cua mang: ");
                size = Integer.parseInt(scanner.nextLine());

                if (size >=  1) {
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.print("Nhap phan tu thu " + (i + 1) + " :");
                        element = Integer.parseInt(scanner.nextLine());
                        arr[i] = element;
                    }
                    System.out.println(Arrays.toString(arr));

                    System.out.print("Nhap phan tu muon them: ");
                    number = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhap vi tri muon them: ");
                    index = Integer.parseInt(scanner.nextLine());

                    if (index >= 0 && index <= size) {
                        int[] newarr = new int[size + 1];
                        newarr[index] = number;
                        for (int i = 0, j = 0; i < size; i++) {
                            if (j == index) {
                                j += 1;
                                i--;
                                continue;
                            }
                            newarr[j] = arr[i];
                            j++;
                        }
                        System.out.println(Arrays.toString(newarr));
                    } else {
                        System.out.println("Chi so nhap vao khong hop le!");
                    }

                } else if (size < 1 && size != -1) {
                    System.out.println("Kich thuoc cua ban khong phu hop!");
                }

            } while (size != -1);

        }
    }
