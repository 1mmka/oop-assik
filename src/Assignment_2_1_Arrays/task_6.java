package Assignment_2_1_Arrays;

import java.util.Scanner;

public class task_6 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];
        int counter = 0;
        int max_val = array[0];

        while (counter < N) {
            int number = scanner.nextInt();
            if (number > max_val) {
                max_val = number;
            }
            array[counter] = number;

            counter += 1;
        }

        System.out.println(max_val);
    }
}
