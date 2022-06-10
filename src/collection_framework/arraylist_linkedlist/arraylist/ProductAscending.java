package collection_framework.arraylist_linkedlist.arraylist;

import java.util.Comparator;

public class ProductAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        double result = o1.getPrice() - o2.getPrice();

        if (result == 0) {
            return (int) (o1.getId() - o2.getId());
        }
        if (result > 0)
            return 1;
        return -1;
    }
}
