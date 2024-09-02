import java.util.Scanner;

    public class TransposeOfMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int SIZE = 3;

            int[][] matrix = new int[SIZE][SIZE];
            int[][] transpose = new int[SIZE][SIZE];


            System.out.println("Enter elements for the 3x3 matrix:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }


            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }


            System.out.println("Original matrix:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Transposed matrix:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }

        }
    }


