package Assignment_2_1_Arrays;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] numberArray = new int[N];
        int indx = 0;

        while (true) {
            if (indx == N) {
                break;
            }
            int number = scanner.nextInt();
            if (number != 0) {
                numberArray[indx] = number;
                indx += 1;
            }
        }

        if (N % 2 == 0) {
            for (int i = N - 1; i > -1; i--) {
                System.out.print(numberArray[i] + " ");
            }
        } else {
            for (int i = 0; i < numberArray.length; i++) {
                System.out.print(numberArray[i] + " ");
            }
        }
    }
}
