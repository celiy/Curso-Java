package InheritancePolymorphism.Example1;

public class Worksite3 {
    public static void main(String[] args) {
        Worker alex = new Worker();
        Tradesperson barbara = new Tradesperson();
        Carpenter carol = new Carpenter();

        //alex.doWoodWork(); // can't inherit from subclass
        //barbara.doWoodWork(); // can't inherit from subclass
        carol.doWoodWork(); // doWoodWork() is in Carpenter
    }
}
