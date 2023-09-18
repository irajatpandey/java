package referencevariable;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Teacher();
        p1.profession();
        Person p2 = new Engineer();
        p2.profession();
        Engineer e1 = new Engineer();
        e1.profession();
        Teacher t1 = new Teacher();
        t1.profession();
    }
}
