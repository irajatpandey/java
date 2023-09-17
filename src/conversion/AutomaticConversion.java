package conversion;

public class AutomaticConversion {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // since int has longer range compare to byte,
                   // it can hold, byte's value in it.
        System.out.println(b); // 10
    }
}
