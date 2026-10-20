package DataTypes;

public class Numbers {
    public void numbers() {
        // Variable
        int varNumber = 222;
        int number;
        number = 123;

        // Constant
        final int CONSTANT_NUMBER = 456;
        final int CONST_N;
        CONST_N = 444;

        // Data types
        // -128 / 127
        byte maxByte = 127;
        byte varByte = 100;
        byte minByte = -128;

        // -32768 / 32767
        short maxShort = 32767;
        short varShort = 5000;
        short minShot = -32768;

        // -9223372036854775808L / 9223372036854775807L
        // Has to have L at the end
        long maxLong = 9223372036854775807L;
        long varLong = 939493493;
        long minLong = -9223372036854775808L;

        // -3.4028235E38F // 3.4028235E38F
        // Has to have F at the end
        float maxFloat = 3.4028235E38F;
        float varFloat = 1.4321F;
        float minFloat = -3.4028235E38F;

        double varDouble = 2.1;
    }
}
