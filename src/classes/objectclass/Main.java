package classes.objectclass;

public class Main {

    public static void main(String[] args) {
        Object p1 = new Employee(12);
        Object p2 = new Teacher(12);

        System.out.println(p1.getClass());
        System.out.println(p2.getClass());
    }
}
