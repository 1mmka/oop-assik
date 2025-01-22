package Assignment_3_Interfaces;

public class task_7 {
    public static void main(String[] args) {
        System.out.println(new Hobby().toString());
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream,Desire {
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
