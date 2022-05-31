package exercises.algorithm;

import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tim: ");
        int x = scanner.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Vi tri so do la: " +i);
                i++;
            }
        }
        System.out.println("So khong co trong mang!");
    }

    public static class BinarySearch {
        public static void main(String[] args) {
            int [] arr = {8,6,5,4,3,1};
            System.out.println(binaryS(arr,5));
        }
        public static int binaryS (int arr[],int x){
            int l = 0, r = arr.length -1, mid ;
            while (r>=l){
                mid =(l+r)/2;
                if(arr[mid]==x)
                    return mid;
                if (arr[mid] < x)
                    r = mid -1;
                else
                    l = mid +1;
            }
            return -1;
        }
    }
}


