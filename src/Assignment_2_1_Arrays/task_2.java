package Assignment_2_1_Arrays;

public class task_2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }
        }

        for (String elem : strings) {
            System.out.println(elem);
        }
    }
}
