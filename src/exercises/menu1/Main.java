package exercises.menu1;

import java.util.Scanner;

public class Main {
    static void menuTong() {
        System.out.println("=====       MENU        =====");
        System.out.println("== 1. Quản lý người dùng   ==");
        System.out.println("== 2. Quản lý sản phẩm     ==");
        System.out.println("== 3. Thoát                ==");
        System.out.println("=============================");
    }

    static void menuUser() {
        System.out.println("==============    USER    ================");
        System.out.println("===  1. Thêm người dùng                ===");
        System.out.println("===  2. Xóa người dùng                 ===");
        System.out.println("===  3. Hiển thị danh sách người dùng  ===");
        System.out.println("===  4. Quay lại                       ===");
        System.out.println("==========================================");
        boolean isEntry = true;
        int choice;
        while (isEntry) {
            choice = sc.nextInt();
            switch (choice) {
                case 1: menuAdd_User();
                break;
                case 2: isEntry = false;
                    break;
                case 3: isEntry = false;
                    break;
                case 4: isEntry = false;
                    break;
                default:
                    System.out.println("vui long chon lại chuc nang");
            }
        }
    }

    static void menuAdd_User() {
        System.out.println("=============  ADD USER  ===============");
        System.out.println("===  1. Thêm tên người dùng          ===");
        System.out.println("===  2. Thêm gmail người dùng        ===");
        System.out.println("===  3. Sửa thông tin người dùng     ===");
        System.out.println("===  4. Quay lại                     ===");
        System.out.println("========================================");
    }

    static void menuProduct() {
        System.out.println("=======  PRODUCT  ========");
        System.out.println("===      1. Áo         ===");
        System.out.println("===      2. Quần       ===");
        System.out.println("===      3. Quay lại   ===");
        System.out.println("==========================");
        boolean isEntry = true;
        int choice;
        while (isEntry) {
            choice = sc.nextInt();
            switch (choice) {
                case 1: menuAdd_User();
                    break;
                case 2: isEntry = false;
                    break;
                case 3: isEntry = false;
                    break;
                case 4: isEntry = false;
                    break;
                default:
                    System.out.println("vui long chon lại chuc nang");
            }
        }
    }
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        while (true) {
            menuTong();
            System.out.println("moi ban nhap so");
            choice = sc.nextInt();
            switch (choice){
                case 1: menuUser();
                break;
                case 2: menuProduct();
                    break;
                case 3: System.exit(3);
                    break;
                default:
                    System.out.println("ban nhap sai thong tin");
            }
        }
    }
}
