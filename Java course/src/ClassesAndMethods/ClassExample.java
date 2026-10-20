package ClassesAndMethods;

// Class: the blueprint for objects. The file name must match the class name.
public class ClassExample {
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(isAdult());
        printHello();
        System.out.println(getScores()[0]);
    }

    // Methods
    // return types
    public static String getName() {
        return "Celi";
    }

    public static int getAge() {
        return 22;
    }

    public static boolean isAdult() {
        return getAge() >= 18;
    }

    // void: returns nothing
    public static void printHello() {
        System.out.println("Hello from a void method!");
    }

    public static int[] getScores() {
        return new int[]{10, 20, 30};
    }
}
