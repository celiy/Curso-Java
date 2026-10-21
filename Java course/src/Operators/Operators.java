package Operators;

public class Operators {
    public static void main(String[] args) {
        int number = 10;

        number += 1;
        number++;

        number -= number;
        number--;

        number *= number;

        System.out.println(number == 1);
        System.out.println(number != 1);
        System.out.println(number > 1);
        System.out.println(number >= 1);
        System.out.println(number < 1);
        System.out.println(number <= 1);

        boolean falseBool = false;
        boolean trueBool = true;

        System.out.println(trueBool && falseBool);
        System.out.println(trueBool || falseBool);
        System.out.println(!trueBool);

        System.out.println(trueBool ? "is true" : "is false");
    }
}
