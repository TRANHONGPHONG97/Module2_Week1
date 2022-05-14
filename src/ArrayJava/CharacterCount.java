
package ArrayJava;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String str, characters;
        int count = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chuoi ki tu: ");
        str = scanner.nextLine().toLowerCase();

        System.out.println("Nhap vao ki tu muon dem: ");
        characters = scanner.nextLine().toLowerCase();

        if (characters.length() > 1) {
            System.out.println("Ban chi duoc nhap 1 ki tu");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (characters.charAt(0) == str.charAt(i)) {
                    flag = true;
                    count++;
                }
            }

            if (!flag) {
                System.out.println("Khong ton tai ki tu do trong mang");
            } else {
                System.out.println("So luong ki tu co trong chuoi la: " + count);
            }
        }
    }
}
