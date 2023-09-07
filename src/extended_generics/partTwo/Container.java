package extended_generics.partTwo;

import java.util.List;

//Generic at class level only for objects inheriting Product and Comparable interface
public class Container<T extends Product & Comparable<T>> {

    public boolean find(List<? extends Product> products, Product p) {
        for (Product product : products) {
            if (product.equals(p)) {
                return true;
            }
        }
        return false;
    }
}
