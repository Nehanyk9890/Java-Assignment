public class sumofdigit {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}


