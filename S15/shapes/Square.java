package S15.shapes;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }
}
