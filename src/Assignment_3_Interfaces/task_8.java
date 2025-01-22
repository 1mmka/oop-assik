package Assignment_3_Interfaces;

public class task_8 {
    public static void main(String[] args) throws Exception {
        Human human1 = new Human(false);
        Human human2 = new Human(true);

        System.out.println(human1.isAlive());
        System.out.println(human2.isAlive());
    }

    interface Person {
        boolean isAlive();
    }

    interface Presentable extends Person{
    }

    static class Human implements Presentable {
        private boolean alive;

        public Human(boolean alive) {
            this.alive = alive;
        }

        public boolean isAlive() {
            return alive;
        }
    }
}
