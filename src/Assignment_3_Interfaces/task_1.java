package Assignment_3_Interfaces;

public class task_1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.land();
    }

    interface CanFly {
        void fly();
        void land();
    }
}


class Bird implements task_1.CanFly {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void land() {
        System.out.println("land");
    }
}