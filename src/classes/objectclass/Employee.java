package classes.objectclass;

public class Employee {
    int empId;
    Employee(int empId){
        this.empId = empId;
    }
    public void display(){
        System.out.println("Employee Id is  " + this.empId);
    }
}
