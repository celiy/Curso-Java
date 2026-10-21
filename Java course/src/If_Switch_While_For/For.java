package If_Switch_While_For;

public class For {
    public static void main(String[] args) {
        // 1 .. 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 1, 2
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        // 1 .. 5
        int n1 = 0;
        for ( ; n1 <= 5; n1++) {
            System.out.println(n1);
        }

        // 1, 3, 5
        for (int n2 = 0; n2 <= 5; n2++) {
            // if the condition is true, the loop will skip
            if (n2 % 2 == 0) {
                continue;
            }

            System.out.println(n2);
        }

        int[] numbers = {1, 2, 3, 0, 0};
        for (int num : numbers) System.out.println(num);
    }
}
