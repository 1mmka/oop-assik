package Assignment_3_Interfaces;

public class task_9 {
    public static void main(String[] args) throws Exception {

    }

    interface CanMove {
        double speed();
    }

    interface CanFly extends CanMove {
        double speed(CanFly canfly);
    }
}
