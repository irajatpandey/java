package referencevariable;

class Employee{
    int empId;
    String name;

}
public class ClassExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 10;
        System.out.println(e1.empId);
        Employee e2 = e1;
        e2.empId = 20;
        System.out.println(e2.empId);

    }
}
