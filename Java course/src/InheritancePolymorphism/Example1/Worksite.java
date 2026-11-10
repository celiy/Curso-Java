package InheritancePolymorphism.Example1;

public class Worksite {
    public static void main(String[] args) {
        Worker albert = new Worker();
        Tradesperson bob = new Tradesperson();
        Carpenter cynthia = new Carpenter();

        albert.doWork(); // Does unskilled work
        bob.doWork(); // Does skilled work
        cynthia.doWork(); // Does woodwork
    }
}
