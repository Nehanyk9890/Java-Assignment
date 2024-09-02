import java.util.Scanner;
public class LongestWordInSentence {

        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            // Close the scanner
            scanner.close();

            // Split the sentence into words
            String[] words = sentence.split("\\s+");

            // Initialize variables to keep track of the longest word
            String longestWord = "";

            // Iterate through the array of words
            for (String word : words) {
                // Check if the current word is longer than the longest found so far
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // Output the longest word
            System.out.println("The longest word is: " + longestWord);
        }
    }


