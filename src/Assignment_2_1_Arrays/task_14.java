package Assignment_2_1_Arrays;

import java.util.Scanner;

public class task_14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[] rows_sum = new int[3];
        int[] cols_sum = new int[3];

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }
            rows_sum[i] = rowSum;
            cols_sum[i] = colSum;
        }

        int min_row_elem = rows_sum[0];
        for (int i = 1; i < rows_sum.length; i++) {
            if (rows_sum[i] < min_row_elem) {
                min_row_elem = rows_sum[i];
            }
        }

        int min_col_elem = cols_sum[0];
        for (int i = 1; i < cols_sum.length; i++) {
            if (rows_sum[i] < min_col_elem) {
                min_col_elem = cols_sum[i];
            }
        }

        int min_row_or_col = (min_row_elem < min_col_elem) ? min_row_elem : min_col_elem;
        System.out.println(min_row_or_col);
    }
}
