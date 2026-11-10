package InheritancePolymorphism.Example3;

public class F16 extends Airplane {
    private int numOfMissiles = 4;

    public F16() {
        super(); // calls Airplane() and not Airplane(boolean isJetPlane)
    }
}
