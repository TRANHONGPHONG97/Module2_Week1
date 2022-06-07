package exercises.arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//Thêm các giá trị vào mảng
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
//In ra mảng
        System.out.println(arrayList);
        System.out.println("");
//Sắp xếp mảng
        Collections.sort(arrayList);
        System.out.println(arrayList);
//Xóa giá trị vị trí số 2
        arrayList.remove(2);
        System.out.println(arrayList);
//Đổi giá trị các phần tử
        System.out.println(arrayList.get(3));
        arrayList.set(3, 10);
        System.out.println(arrayList.get(3));
//Chuyển ArrayList thành mảng, in ra các giá trị phần tử trong mảng
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]" + " = " + array[i]);
        }
    }
}
