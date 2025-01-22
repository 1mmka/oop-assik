package Assignment_3_Interfaces;

public class task_4 {
    public static void main(String[] args) {
    }

    public interface CanRun {
        public void run();
        public void drive();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun,CanSwim {

    }
}
