package vn.thphong.productmanager.service;

import vn.thphong.productmanager.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product newProduct);

    void update(Product newProduct);

    boolean exitsByID(long id);

    Product searchProductById(long id);

    void removeProductByID(long id);

    Product searchName(String title);

    boolean exitsByName(String title);

    List<Product> searchProductByName(String title);

    List<Product> findAllByPriceDESC();

    List<Product> findAllByPriceASC();
}
