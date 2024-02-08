package ie.atu.sw; // Created this package to avoid naming collisions

public class Runner { // class Runner will run the app
    public static void main(String[] args) {
        byte b = 65; // 127 is max value for byte (8 bits)
        int i = b; // int is 32 bits
        float f = i; // float is 32 bit & has a precision of 7-9 p.o.d. (places of decimal)
        long l = (long) f; // long is 64 bit. We have to CAST float to long
        double d = l; // double is 64 bit with precision of 16-19 p.o.d.
        char c = (char) d; // char has 16 bit

        System.out.println("Result " + c);
        c++; // means c + 1
        // c = (char) (c + 1) is another way of doing this
        System.out.println("Result " + c);

        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(f))); // binary form (31 digits)
    }
}
