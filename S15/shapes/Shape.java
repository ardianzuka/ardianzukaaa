package S15.shapes;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract double calculateArea();

    public void displayColor() {
        System.out.println("The color of the shape is: " + color);
    }
}
