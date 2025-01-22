package Assignment_3_Interfaces;

public class task_3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        human.swim();
    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    static class Human implements CanRun, CanSwim {
        public void run() {
            System.out.println("human - run");
        }

        public void swim() {
            System.out.println("human - swim");
        }
    }

    static class Duck implements CanFly, CanRun, CanSwim {
        public void fly() {
            System.out.println("Duck - fly");
        }

        public void run() {
            System.out.println("Duck - run");
        }

        public void swim() {
            System.out.println("Duck - swim");
        }
    }

    static class Penguin implements CanRun, CanSwim {
        public void run() {
            System.out.println("Penguin - run");
        }

        public void swim() {
            System.out.println("Penguin - swim");
        }
    }

    static class Airplane implements CanFly {
        public void fly() {
            System.out.println("Airplane - fly");
        }
    }
}
