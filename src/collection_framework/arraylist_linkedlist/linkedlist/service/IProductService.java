package collection_framework.arraylist_linkedlist.linkedlist.service;

import collection_framework.arraylist_linkedlist.linkedlist.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();
    void addProduct(Product product);
    void editProduct();
    void removeProduct();
    void showProduct();
    void searchProduct();
    void sortProduct();
}
