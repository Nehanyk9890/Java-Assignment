import java.util.Scanner;

public class positivenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int number = scanner.nextInt();

            // Check if the input is zero and exit the loop
            if (number == 0) {
                break;
            }

            // Skip negative numbers
            if (number < 0) {
                continue;
            }

            // Add positive numbers to the sum
            sum += number;
        }

        // Print the result
        System.out.println("Sum of positive numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}
