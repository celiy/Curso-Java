package If_Switch_While_For;

public class If {
    public static void main(String[] args) {
        if (true) {
            System.out.println("is true");
        }

        if (false) {
            System.out.println("is true");
        } else {
            System.out.println("else");
        }

        if (false) {
            System.out.println("true");
        } else if (true) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }
    }
}
