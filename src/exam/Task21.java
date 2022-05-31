package exercises;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        int a[] = {1,2,3,4,5,6,7,8,9};
        int[] a;
        int size;
        do {
            System.out.print("Enter the size: ");
            size = sc.nextInt();
            if (size < 20) {

            } else {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        a = new int[size];
        int i = 0;
        while (i < a.length) {
            System.out.print("Enter element" + (i + 1) + ": ");
            a[i] = sc.nextInt();
            i++;
        }
        int sum = 0;
        for (i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
//                continue;
                sum += a[i];
            }

        }
        System.out.print("Tổng của các vị trí lẻ trong mảng: " + sum);
    }
}
