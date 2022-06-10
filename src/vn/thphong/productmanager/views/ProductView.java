package vn.thphong.productmanager.views;

import vn.thphong.productmanager.model.Product;
import vn.thphong.productmanager.service.IProductService;
import vn.thphong.productmanager.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    IProductService productService = new ProductService();
    public Scanner scanner = new Scanner(System.in);


    public void addProduct() {

        do {
            System.out.println("Nhập id sản phẩm:");

            long id = Integer.parseInt(scanner.nextLine());

            if (productService.exitsByID(id)) {
                System.out.println("ID đã tồn tại ");
            } else {
                System.out.println("Nhập tên sản phẩm: ");
                String title = scanner.nextLine();
                System.out.println("Nhập giá: ");
                double price = Double.parseDouble(scanner.nextLine());

                productService.add(new Product(id, title, price));
            }
        } while (true);
    }

        public void renderProduct (List < Product > products) {
            System.out.println("----------------------------PRODUCT---------------------------------");
            System.out.printf("%-10s %-20s %-20s\n", "ID", "title", "price");

            for (Product product : products) {
                System.out.printf("%-10d %-20s %-20s\n",
                        product.getId(),
                        product.getTitle(),
                        product.getPrice());
            }
            System.out.println("--------------------------------------------------------------------");
        }

        public void updateProductID (List < Product > products) {
            renderProduct(products);
            System.out.println("Nhập ID muốn sửa: ");
            long id = Integer.parseInt(scanner.nextLine());
            if (productService.exitsByID(id)) {
                for (Product product : products) {
                    if (id == product.getId()) {
                        System.out.println("Nhập tên mới: ");
                        String name = scanner.nextLine();
                        product.setTitle(name);
                        System.out.println("Nhập giá mới: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        product.setPrice(price);
                        System.out.println("Sửa thành công!");
                        return;
                    }
                }
            }
//        System.out.println("Nhập tên mới: ");
//        String title = scanner.nextLine();
//        System.out.println("Nhập giá mới: ");
//        double price = Double.parseDouble(scanner.nextLine());
//        Product product = new Product(id, title, price);
//        productService.update(product);
//        renderProduct(products);
        }


        public void removeProductID () {
            System.out.println("Nhập ID muốn Xóa: ");
            long id = Integer.parseInt(scanner.nextLine());
            if (productService.exitsByID(id)) {
                productService.removeProductByID(id);
                System.out.println("Xóa thành công!");
                return;
            }
            System.out.println("ID không tồn tại: ");
        }

        public void searchName (List < Product > products) {
            System.out.println("Nhập tên muốn tìm");
            String title = scanner.nextLine();
            System.out.println("Từ khóa " + title + " tìm được trong danh sách là: ");
            for (Product product : products) {
                if (productService.exitsByName(title)) {
                    renderProduct(productService.searchProductByName(title));
                    return;
                }
            }
            System.out.println("không có trong danh sách!");
        }

        public void launch () {
            int choice;
            do {
                System.out.println("=====================  PRODUCT MANAGER  =====================");
                System.out.println("==      1. Thêm sản phẩm                                   ==");
                System.out.println("==      2. Sửa thông tin sản phẩm theo id                  ==");
                System.out.println("==      3. Xoá sản phẩm theo id                            ==");
                System.out.println("==      4. Hiển thị danh sách sản phẩm                     ==");
                System.out.println("==      5. Tìm kiếm sản phẩm theo tên                      ==");
                System.out.println("==      6. Hiển thị sản phẩm theo giá tiền tăng dần        ==");
                System.out.println("==      7. Hiển thị sản phẩm theo giá tiền giảm dần        ==");
                System.out.println("==      0. Để thoát chương trình                           ==");
                System.out.println("=============================================================");

                System.out.print("Chọn chức năng: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        updateProductID(productService.findAll());
                        break;
                    case 3:
                        removeProductID();
                        break;
                    case 4:
                        renderProduct(productService.findAll());
                        break;
                    case 5:
                        searchName(productService.findAll());
                        break;
                    case 6:
                        renderProduct(productService.findAllByPriceASC());
                        break;
                    case 7:
                        renderProduct(productService.findAllByPriceDESC());
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Sai chức năng, mời chọn lại");
                }
            } while (true);
        }
    }
