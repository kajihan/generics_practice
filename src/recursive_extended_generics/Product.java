package recursive_extended_generics;

import java.util.Objects;

//Generic at class level only for objects that inherit Product with its own type and Comparable interface
public abstract class Product<T extends Product<T>> implements Comparable<T> {

    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product<?> product = (Product<?>) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public abstract int compareTo(T p);


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                '}';
    }
}