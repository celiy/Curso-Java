package ImmutableClasses;

public class UseC1AndC2 {
    public static void main(String[] args) {
        C1 c1 = new C1(1, new C2(1));

        C2 c2 = c1.getC2();

        c2.setX(3);
    }
}
