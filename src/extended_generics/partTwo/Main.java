package extended_generics.partTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container<Camera> container = new Container<>();

        List<Camera> camerasList = new ArrayList<>();
        camerasList.add(new Camera(4));
        camerasList.add(new Camera(23));
        camerasList.add(new Camera(1));

        Camera cameraSony = new Camera(1);

        System.out.println(container.find(camerasList, cameraSony));
    }
}