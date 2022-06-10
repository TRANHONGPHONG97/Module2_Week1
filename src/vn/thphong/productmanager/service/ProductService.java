package vn.thphong.productmanager.service;

import vn.thphong.productmanager.model.Product;
import vn.thphong.productmanager.sort.sortByPriceASC;
import vn.thphong.productmanager.sort.sortByPriceDEC;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    public  final  List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Trâu xào lá lốt", 1000000));
        productList.add(new Product(2, "Cá Lóc um măng", 120000));
        productList.add(new Product(3, "Tôm xóc tỏi", 900000));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product newProduct) {
        newProduct.setId(System.currentTimeMillis()/1000);
        List<Product> productList = findAll();
        productList.add(newProduct);
//        productList.add(newProduct);
    }

    @Override
    public void update(Product newProduct) {
        for (Product product: productList) {
            if(product.getId() == newProduct.getId()){
                product.setId(newProduct.getId());
                product.setTitle(newProduct.getTitle());
                product.setPrice(newProduct.getPrice());
            }
        }
    }
    @Override
    public Product searchProductById(long id) {
        for (Product product : productList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }
    @Override
    public boolean exitsByID(long id) {
        return searchProductById(id) != null;
    }

    @Override
    public void removeProductByID(long id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
            }
        }
    }

    @Override
    public Product searchName(String title) {
        for (Product product : productList) {
            if(product.getTitle().contains(title)){
                return product;
            }
        }
        return null;
    }
    @Override
    public boolean exitsByName(String title) {
        return searchName(title) !=null;
    }


    @Override
    public List<Product> searchProductByName(String title) {
        List<Product> searchList = new ArrayList<>();
        for (Product product : productList){
            if (product.getTitle().contains(title)){
                searchList.add(product);
            }
        }
        return  searchList;
    }

    @Override
    public List<Product> findAllByPriceDESC() {
        List<Product> sortByPrice = new ArrayList<>(productList);
        sortByPrice.sort(new sortByPriceDEC());
        return sortByPrice;
    }

    @Override
    public List<Product> findAllByPriceASC() {
        List<Product> sortByPrice = new ArrayList<>(productList);
        sortByPrice.sort(new sortByPriceASC());
        return sortByPrice;
    }
}
