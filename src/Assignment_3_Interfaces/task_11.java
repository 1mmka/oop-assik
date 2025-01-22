package Assignment_3_Interfaces;

public class task_11 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public static class Dog implements Movable,Eat{
        @Override
        public void move() {
            System.out.println("dog - move");
        }

        @Override
        public void eat() {
            System.out.println("dog - eat");
        }
    }

//    public static class Cat implements Movable,Edible,Eat{
//
//    }
//
//    public static class Mouse implements Movable,Edible{
//
//    }
}
