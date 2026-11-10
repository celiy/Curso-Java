package InheritancePolymorphism.Example2;

public class SelfDrivingCar extends Car {
    @Override
    public void applyBrakes() {
        System.out.println("Computer applies brakes");
        checkSurroundings();
    }

    @Override
    public void checkSurroundings() {
        System.out.println("Computer checks surroundings");
    }

    public void emergencyOverride() {
        System.out.println("Driver takes control");

        // By using super it uses the original applyBrakes() from the Car class instead of the local overriden one
        super.applyBrakes();
    }
}
