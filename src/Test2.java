import java.lang.*;
import java.lang.reflect.Method;

class Student{
    public int rollno;
    public String name;
    public void setStudent(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void print(){
        System.out.println("Name " + name + " " + "Roll no " + rollno);
    }
}
class Test2 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Student");
        Method m[]  = c.getDeclaredMethods();
        for(Method m1 : m){
            System.out.println(m1);
        }
    }

}
