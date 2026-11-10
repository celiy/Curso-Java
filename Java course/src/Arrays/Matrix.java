package Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] numbers = new int[5][3]; // 5 rows, 3 cols

        for (int i = 0; i < numbers.length; i++) {
            for (int n = 0; n < numbers[i].length; n++) {
                System.out.print(numbers[i][n] + " ");
            }

            System.out.println();
        }
    }
}
