package If_Switch_While_For;

public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("is less than 5");
            i++;
        }

        while (true) {
            System.out.println(i++);

            if (i == 100) {
                break;
            }
        }
    }
}
