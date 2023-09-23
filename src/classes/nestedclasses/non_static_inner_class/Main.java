package classes.nestedclasses.non_static_inner_class;

public class Main {
    public static void main(String[] args) {
//        Person.Teacher p1 = Person.new.Teacher();
    Person pp = new Person();
    Person.Teacher p1 = pp.new Teacher();
    p1.display();
    }
}
