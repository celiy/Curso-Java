package InheritancePolymorphism.Example1;

public class Tradesperson extends Worker {
    public void doSkilledWork() {
        System.out.println("Does skilled work");
    }

    // doWork() alread comes from Worker so @Override overrides the original
    @Override
    public void doWork() {
        System.out.println("Does skilled work");
        earnUnionWage();
    }

    private void earnUnionWage() {
        System.out.println("Earns union wage");
    }
}
