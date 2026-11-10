package InheritancePolymorphism.Example1;

public class Carpenter extends Tradesperson {
    public void doWoodWork() {
        System.out.println("Does woodwork");
    }

    // doWork alread comes from Worker so @Override overrides the original
    @Override()
    public void doWork() {
        System.out.println("Does woodwork");
        earnCarpentersWage();
    }

    private void earnCarpentersWage() {
        System.out.println("Earns carpenter wage");
    }
}
