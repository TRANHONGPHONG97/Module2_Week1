package collection_framework.arraylist_linkedlist.linkedlist.view;

import collection_framework.arraylist_linkedlist.linkedlist.model.Product;
import collection_framework.arraylist_linkedlist.linkedlist.service.ProductService;

import java.util.Scanner;

public class ProductView {
    ProductService productService = new ProductService();

    Scanner sc = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            Menu.mainMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
//                case 4:
//                    showProduct();
//                    break;
//                case 5:
//                    searchProduct();
//                    break;
//                case 6:
//                    sortProduct();
//                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại: ");
            }
        } while (choice != 6);
    }

    private void addProduct() {
        String name;
        int ID;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm tên sp: ");
        name = sc.nextLine();

        System.out.println("Thêm ID: ");
        ID = sc.nextInt();

        System.out.println("Thêm giá: ");
        price = sc.nextDouble();
        Product newProduct = new Product(ID, name, price);
    }

    public static void main(String[] args) {
        ProductView productView = new ProductView();
        productView.addProduct();
        productView.editProduct();
        productView.removeProduct();
    }


    private void editProduct() {
        if (productService.productList.isEmpty()) {
            System.out.println("Không có sản phầm này trong danh sách");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ID sản phẩm chỉnh sửa:");
            int ID = scanner.nextInt();

            if (productService.checkID(ID)) {
                for (Product product : productService.productList) {
                    if (product.getID() == ID) {
                        System.out.println("ID của sản phẩm là: " + ID + " Sản phẩm là: " + product);
                        char choice;


                        do {
                            System.out.println("Chỉnh sửa sản phẩm");
                            System.out.println("1. Chỉnh sửa ID");
                            System.out.println("2. Chỉnh sửa tên");
                            System.out.println("3. Chỉnh sửa giá");
                            System.out.println("0. Thoát");

                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);

                            switch (choice) {
                                case '1':
                                    System.out.println("Nhập ID bạn muốn sửa: ");
                                    int newID = sc.nextInt();
                                    product.setID(newID);
                                    break;
                                case '2':
                                    System.out.println("Nhập tên muốn sửa: ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '3':
                                    System.out.println("Nhập giá muốn sửa: ");
                                    double newPrice = sc.nextDouble();
                                    product.setPrice(newPrice);
                                    break;
                                case '0':
                                    Menu.mainMenu();
                                    break;
                            }
                        } while (choice != 0);

                    }
                }
            }
        }
    }

    private void removeProduct() {
        if (productService.productList.isEmpty()) {
            System.out.println("Sản phẩm này không có trong danh sách");

        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ID muốn xóa: ");
            int ID = scanner.nextInt();

            if (productService.checkID(ID)) {
                for (Product product : productService.productList) {
                    if (product.getID() == ID) {
                        System.out.println("Sản phẩm cần xóa là: " + product.toString());
                        productService.productList.remove(ID);
                    }
                }
            } else {
                System.out.println("ID không có trong danh sách sản phẩm");
            }
        }
    }
}
