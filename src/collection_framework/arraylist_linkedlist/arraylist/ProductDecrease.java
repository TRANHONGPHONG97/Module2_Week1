package collection_framework.arraylist_linkedlist.arraylist;

import java.util.Comparator;

public class ProductDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double result = o2.getPrice() - o1.getPrice();

        if(result == 0){
            return (int) (o2.getId() - o1.getId());
        }
        if (result > 0){
            return 1;
        }
        return -1;
    }
}
