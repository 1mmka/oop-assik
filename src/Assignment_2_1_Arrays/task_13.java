package Assignment_2_1_Arrays;

import java.util.Scanner;

public class task_13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max_val = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max_val) {
                    max_val = array[i][j];
                }
            }
        }

        System.out.println(max_val);
    }
}
