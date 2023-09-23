package classes.objectclass;

public class Teacher {
    int empId;
    Teacher(int empId){
        this.empId = empId;
    }
    public void display(){
        System.out.println("Employee Id is  " + this.empId);
    }
}
