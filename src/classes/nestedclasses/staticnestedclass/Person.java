package classes.nestedclasses.staticnestedclass;

public class Person {
    int empId;
    static class Teacher{
        float salary;
        public void display(){
            System.out.println("In Static Display");
        }
    }
}

