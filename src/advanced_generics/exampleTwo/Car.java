package advanced_generics.exampleTwo;

import java.util.List;

public class Car {
    private List<Passenger> passengers;

    public Car(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }
}
