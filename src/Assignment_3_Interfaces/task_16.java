package Assignment_3_Interfaces;

public class task_16 {
    public static void main(String[] args) throws Exception {
        Fox fox = new Fox();
        System.out.println(fox.getName());
    }

    public interface Animal {
        Color getColor();
        Integer getAge();
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }

        @Override
        public Color getColor() {
            return Color.RED;
        }

        @Override
        public Integer getAge() {
            return 3;
        }
    }

    public enum Color {
        RED, GREEN, BLUE
    }
}
