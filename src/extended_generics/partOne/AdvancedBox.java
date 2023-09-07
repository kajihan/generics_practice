package extended_generics.partOne;

import java.util.ArrayList;
import java.util.List;

public class AdvancedBox {

    //Wildcard extends Number
    public void sumNumbers(List<? extends Number> list) {
        double res = 0;
        for (Number number : list) {
            res += number.doubleValue();
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        AdvancedBox advancedBox = new AdvancedBox();
        List<Double> doubles = new ArrayList<>();
        doubles.add(34d);
        doubles.add(345d);
        doubles.add(34.6);
        advancedBox.sumNumbers(doubles);
    }
}
