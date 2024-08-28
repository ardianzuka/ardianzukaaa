package S15.shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Circle circle = new Circle("Green", 4);

        circle.displayColor();
        double circleArea = circle.calculateArea();
        System.out.println("Calculated area for the given circle is: " + circleArea);

    }
}
