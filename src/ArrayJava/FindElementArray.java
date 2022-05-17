package ArrayJava;
import java.util.Scanner;
public class FindElementArray {
    public static void main(String[] args) {
        String [] students = {"Nam", "Tri", "Loc", " Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String input_name = scanner.nextLine();

        boolean flag = false;
        for (int i= 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri hoc sinh la: " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Khong co " + input_name + "trong mang");
        }
    }
}
