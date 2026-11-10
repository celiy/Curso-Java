package InheritancePolymorphism.Example2;

public class Highway {
    public static void main(String[] args) {
        Car fordMustang = new Car();
        SelfDrivingCar kitt = new SelfDrivingCar();

        fordMustang.applyBrakes(); // "Driver apply brakes", "Driver checks surroundings"
        kitt.applyBrakes(); // "Computer applies brakes", "Computer checks surroundings"
        kitt.emergencyOverride(); // "Driver takes control", "Driver apply brakes", "Computer checks surroundings"
    }
}
