package Scanner;

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.next(); // Read a string
        input.nextLine(); // Read a string with spaces

        input.nextInt(); // Read an integer
        input.nextDouble(); // Read a double
        input.nextByte(); // Byte
        input.nextShort(); // Short
        input.nextLong(); // Long
        input.nextFloat(); // Float
        input.nextBoolean(); // Boolean
    }
}
