package InheritancePolymorphism.Example2;

public class Car {
    public void applyBrakes() {
        System.out.println("Driver apply brakes");
        checkSurroundings();
    }

    public void checkSurroundings() {
        System.out.println("Driver checks surroundings");
    }
}
