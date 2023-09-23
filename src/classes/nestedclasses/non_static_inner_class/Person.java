package classes.nestedclasses.non_static_inner_class;

public class Person {
    int empId;
    class Teacher{
        float salary;
        public void display(){
            System.out.println("In Inner class Display");
        }
    }
}