package S15.vehicle;

public class Vehicle {

    protected String brand;

    public  Vehicle(String brand) {
        this.brand = brand;
    }
    public void start() {
        System.out.println("Starting the " + brand + " vehicle");
    }
}
