package InheritancePolymorphism.Example3;

public class Airplane extends Vehicle {
    private boolean hasJetEngines;

    public Airplane() {
        super("red", 1234); // calls Vehicle(String newColor, int newVin)
        hasJetEngines = false;
    }

    public Airplane(boolean isJetPlane) {
        super("blue", 112233); // calls Vehicle(String newColor, int newVin)
        hasJetEngines = isJetPlane;
    }
}
