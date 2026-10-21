package If_Switch_While_For;

public class Switch {
    public static void main(String[] args) {
        int n1 = 10;
        // is 10
        // is 90
        // none of the above
        switch (n1) {
            case 10: //start from here
                System.out.println("is 10");
            case 90:
                System.out.println("is 90");
            default:
                System.out.println("none of the above");
        }

        int n2 = 90;
        // is 90
        // none of the above
        switch (n2) {
            case 10:
                System.out.println("is 10");
            case 90: //start from here
                System.out.println("is 90");
            default:
                System.out.println("none of the above");
        }
        // none of the above
        switch (n2) { // n2 = 90
            case 12:
                System.out.println("is 12");
            case 91:
                System.out.println("is 91");
            default: // start from here
                System.out.println("none of the above");
        }

        int n3 = 10;
        // is 10
        // is 90
        switch (n3){
            case 10: // start and
                System.out.println("is 10");
            case 90: // end here
                System.out.println("is 90");
                break;
            default:
                System.out.println("none of the above");
        }
    }
}
