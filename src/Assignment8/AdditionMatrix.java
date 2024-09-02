import java.util.Scanner;
public class AdditionMatrix {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            final int ROWS = 2;
            final int COLS = 2;


            int[][] matrix1 = new int[ROWS][COLS];
            int[][] matrix2 = new int[ROWS][COLS];
            int[][] resultMatrix = new int[ROWS][COLS];


            System.out.println("Enter elements for the first 2x2 matrix:");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }


            System.out.println("Enter elements for the second 2x2 matrix:");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }


            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }


            System.out.println("Resulting matrix after addition:");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }


