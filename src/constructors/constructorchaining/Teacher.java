package constructors.constructorchaining;

public class Teacher extends Person{
    int empId;
    public Teacher(int empId){
        super("Max"); // to call parent class constructor
        this.empId = empId;
        System.out.println("Teacher class Constructor");
    }
}
