package classes.abstracclass;

abstract class Shape{
    public abstract int calculateArea();
    public void display(){
        System.out.println("Inside Abstract class");
    }
}
class Rectangle extends Shape {

    int length;
    int breath;
    Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }
    @Override
    public int calculateArea() {
        System.out.println("Method has been overridden");
        return this.length * this.breath;
    }
}

public class Main{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        System.out.println(r.calculateArea());
    }
}