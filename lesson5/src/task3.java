public class task3 {
    public static void main(String[] args) {
        int[][] table = generateMatrix();
        int sum = calculateSum(table);
        printMatrix(table);
        System.out.println("Sum: " + sum);
    }

    static int[][] generateMatrix() {
        int[][] matrix = new int[10][10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            matrix[i][i] = i;
            sum += i;
        }
        return matrix;
    }

    static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
