package introduction;
import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

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
class Test {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Student");
        Method m[]  = c.getDeclaredMethods();
        for(Method m1 : m){
            System.out.println(m1);
        }

        Field [] f = c.getFields();
        for(Field f1 : f){
            System.out.println(f1);
        }

    }

}
