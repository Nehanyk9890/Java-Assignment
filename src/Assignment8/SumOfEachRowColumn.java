import java.util.Scanner;
public class SumOfEachRowColumn {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];

            System.out.println("Enter the elements of the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Sum of each row:");
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;
                for (int j = 0; j < 3; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Sum of row " + i + ": " + rowSum);
            }

            System.out.println("Sum of each column:");
            for (int j = 0; j < 3; j++) {
                int colSum = 0;
                for (int i = 0; i < 3; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Sum of column " + j + ": " + colSum);
            }

        }
    }


