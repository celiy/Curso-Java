package Methods;

public class Me {
    public static void main(String[] args) {
        double sumNumber1 = sum(1, 20.1);
        int sumNumber2 = sum(1, 2, 3);
    }

    public static double sum(int x, double y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static String sayName() {
        return "Celi ClassesAndMethods.Herstal.";
    }

    public static int sayAge() {
        return 22;
    }
}
