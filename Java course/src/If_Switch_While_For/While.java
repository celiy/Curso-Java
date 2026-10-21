package If_Switch_While_For;

public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println(i + " ,is less than 6");
            i++;
        }

        while (true) {
            i++;

            if (i == 100) {
                System.out.println("is 100");
                break;
            }
        }

        // runs at least once before testing the condition
        do {
            System.out.println(i + " ,is less than 200");
            i++;
        } while (i < 200);
    }
}
