package referencevariable;

public interface Person {
    public void profession();
}

class Teacher implements Person{
    public void profession(){
        System.out.println("Teaching");
    }
}

class Engineer implements Person{
    public void profession(){
        System.out.println("Software Engineer");
    }
}

