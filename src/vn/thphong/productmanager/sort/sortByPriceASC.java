package vn.thphong.productmanager.sort;

import vn.thphong.productmanager.model.Product;

import java.util.Comparator;

public class sortByPriceASC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double result = o1.getPrice() - o2.getPrice();
        return result == 0 ? 0 : (result > 0 ? 1 : -1);
    }
}
