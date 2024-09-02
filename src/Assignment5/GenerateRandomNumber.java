public class GenerateRandomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 500;


        int randomNumber = min + (int)(Math.random() * (max - min + 1));

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + " is " + randomNumber);
    }
}


