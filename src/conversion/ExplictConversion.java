package conversion;

public class ExplictConversion {
    public static void main(String[] args) {
        int a = 128;
        byte b = (byte)a;
        System.out.println(b); // -128
        // since byte store data from -128 to 127
        // it is out of range.


    }
}
