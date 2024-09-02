public class palindrome {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama"; // Example input

        // Call the isPalindrome method and print the result
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert to lowercase and remove spaces
        String cleanedStr = str.toLowerCase().replaceAll("\\s+", "");

        // Get the reverse of the cleaned string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Check if the cleaned string equals its reverse
        return cleanedStr.equals(reversedStr);
    }
}
