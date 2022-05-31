package exercises.menu;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int number;

    public  void mainMenu() {
        System.out.println("=====       MENU        =====");
        System.out.println("== 1. Quản lý người dùng   ==");
        System.out.println("== 2. Quản lý sản phẩmm    ==");
        System.out.println("== 3. Thoát                ==");
        System.out.println("=============================");
        do {
            System.out.print("Chọn chức năng: ");
            number = sc.nextInt();
            switch (number){
                case 1: userMenu();
                break;
                case 2: productMenu();
                break;
                case 3: System.exit(3);
                default:
                    System.out.print("Nhập sai, mời nhập lại: ");
                    break;
            }
        }while (number!=3);
    }

    public  void userMenu() {
        System.out.println("=== Quan li nguoi dung ===");
        System.out.println("===     1. Name        ===");
        System.out.println("===     2. Age         ===");
        System.out.println("===     3. Quay lai    ===");
        System.out.println("==========================");
        do {
            System.out.print("Nhập chức năng: ");
            number = sc.nextInt();
            switch (number){
                case 1: userMenu_con();
                break;
                case 2:
                    break;
                case 3: mainMenu();
                break;
            }
        }while (number!=3);
    }
public void userMenu_con(){
    System.out.println("===   Quản lý Name  ===");
    System.out.println("===   1. Bò         ===");
    System.out.println("===   2. Bê         ===");
    System.out.println("===   3. Quay lai   ===");
    System.out.println("=======================");
    do {
        System.out.print("Chọn chức năng: ");
        number=sc.nextInt();
        switch (number){
            case 3: userMenu();
            break;
            default:
                System.out.print("Nhập sai, mời nhập lại: ");
                break;
        }
    }while (number!=3);
}
    public  void productMenu() {
        System.out.println("===  Quan li san pham  ===");
        System.out.println("===      1. Ao         ===");
        System.out.println("===      2. Quan       ===");
        System.out.println("===      3. Quay lai   ===");
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }
}



