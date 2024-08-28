package S15.vehicle;

public class Car extends Vehicle {

    int numberOfDoors;

    public Car(int numberOfDoors, String brand) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }
    public void drive() {
        System.out.println("Driving the " + brand + " car with " + numberOfDoors + "doors " );
    }
}
