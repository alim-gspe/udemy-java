package primitivetype;

public class Main {
    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("MIN Integer = " + minInt);
        System.out.println("MAX Integer = " + maxInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("MIN byte = " + minByte);
        System.out.println("MAX byte = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("MIN short = " + minShort);
        System.out.println("MAX short = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("MIN long = " + minLong);
        System.out.println("MAX long = " + maxLong);

        // casting
        byte minByteDivide = (byte) (minByte / 2);

        // primitive type challenge
        byte byteOne = 10;
        short shortOne = 100;
        int intOne = 1000;
        long longOne = 50000 + (10 * (byteOne + shortOne + intOne));
        System.out.println(longOne);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("MIN float = " + minFloat);
        System.out.println("MAX float = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("MIN double = " + minDouble);
        System.out.println("MAX double = " + maxDouble);
    }
}
