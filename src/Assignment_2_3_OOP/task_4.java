package Assignment_2_3_OOP;

class Entity {
    public void move() {
        System.out.println("I'm moving.");
    }
    public void eat(){
        System.out.println("I'm eating.");
    }
}

class Human2 extends Entity{
    public void speak(){
        System.out.println("I can communicate.");
    }
}

class JavaDeveloper extends Human2{
    public void code(){
        System.out.println("I know how to communicate in Java.");
    }
}

public class task_4 {
    public static void main(String[] args) {

    }
}
