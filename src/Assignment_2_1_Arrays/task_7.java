package Assignment_2_1_Arrays;

import java.util.Scanner;

public class task_7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String line = scanner.nextLine();
            strings[i] = line;
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
