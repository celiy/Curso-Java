package Scope;

public class Scope {
    public static void main(String[] args) {
        // can only be used inside the if statement
        if (true) {
            int local1;
        }
        // error:
        // local1 = 0;

        // can only be used inside the for
        for (int local3 = 0; local3 <= 5; local3++) {
            System.out.println(local3);
        }
        // error
        // System.out.println(local3);
    }
}
