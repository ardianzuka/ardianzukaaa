package S15.animals;

public class Bird implements Animal, Flyes {


    @Override
    public void makeSound() {
        System.out.println("Bird is making a sound ");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying ");

    }
}
