package with_generics;

import java.util.ArrayList;

// Generic on class level
public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // Generic on method level
    public <V> void print(V value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(Integer.valueOf(45));

        Box<String> strBox = new Box<>();
        strBox.setItem(new String("test"));

        System.out.println(intBox.getItem());
        intBox.print("test23");
        intBox.print(34567);
        intBox.print(new Object());
        intBox.print(new ArrayList<>());

        System.out.println("---------------");

        System.out.println(strBox.getItem());
        strBox.print(1234);
        strBox.print(new Object());
    }
}
