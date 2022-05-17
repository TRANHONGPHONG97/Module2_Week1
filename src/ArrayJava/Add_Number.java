package ArrayJava;
import java.util.Arrays;
public class Add_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int x = 7;
        int index = 3;
        int[] temp = new int[6];
        for (int i = 0; i < temp.length; i++) {
           if (i < index)
                temp[i] = arr[i];
            else if (i == index)
                temp[i] = x;
            else
                temp[i] = arr[i - 1];
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
}

