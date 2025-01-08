package Assignment_2_1_Arrays;

public class task_4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];

    public static void main(String[] args) {
        int counter = 2;
        int[] copy;
        int save_index = 0;

        while (counter > 0) {
            if (counter == 2) {
                copy = firstArray.clone();
            } else {
                copy = secondArray.clone();
            }

            for (int i = 0; i < copy.length; i++) {
                resultArray[save_index + i] = copy[i];
            }

            save_index += copy.length;
            counter -= 1;
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
