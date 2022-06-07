package collection_framework.arraylist_linkedlist.linkedlist.service;

import collection_framework.arraylist_linkedlist.linkedlist.model.Product;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    public final ArrayList<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Bò", 100000));
        productList.add(new Product(2, "Bê", 120000));
        productList.add(new Product(3, "Trâu", 150000));
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }

    public boolean checkProductList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product)
                    return true;
            }
        }
        return false;
    }

    public boolean checkID(int ID) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getID() == ID)
                    return true;
            }
        }
        return false;
    }

    public boolean checkName(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName() == name)
                    return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product newProduct) {
        productList.add(newProduct);

    }

    @Override
    public void editProduct() {

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void showProduct() {

    }

    @Override
    public void searchProduct() {

    }

    @Override
    public void sortProduct() {

    }
}
