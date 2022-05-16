package ArrayJava;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap phan tu xoa: ");
        int index_del = scanner.nextInt();
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
//        for (int i = 0; i < array.length; i++){
//            if(i == index_del){
//                i++;
//            }
//            System.out.println(array[i]);
        System.out.println("mang sau khi xoa la: " + Arrays.toString(array));
    }
}

