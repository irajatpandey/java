package referencevariable;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // checks both are pointing to same memory location
        System.out.println(s1.equals(s2)); // checks both string has same value
        System.out.println(s1 == s3);
    }
}
