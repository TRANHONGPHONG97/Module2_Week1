package exercises.algorithm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {8, 7, 9, 2, 3};
//        for (int i = 0; i < arr.length; i++) {
//            int j = i;
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j = j - 1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}


