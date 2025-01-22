package Assignment_3_Interfaces;

public class task_2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();
    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    static class Dog implements CanMove,CanEat {
        public void move() {
            System.out.println("dog - move");
        }
        public void eat() {
            System.out.println("dog - eat");
        }
    }

    static class Duck implements CanMove,CanFly,CanEat {
        public void move() {
            System.out.println("duck - move");
        }

        public void fly() {
            System.out.println("duck - fly");
        }

        public void eat() {
            System.out.println("duck - eat");
        }
    }

    static class Car implements CanMove {
        public void move() {
            System.out.println("car - move");
        }
    }

    static class Airplane implements CanMove,CanFly {
        public void move() {
            System.out.println("airplane - move");
        }

        public void fly() {
            System.out.println("airplane - fly");
        }
    }
}
