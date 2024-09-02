public class VowelConsonant {
    public static void main(String[] args){
                String input = "Hello World!"; // Example input

                // Call the countVowelsAndConsonants method and get the results
                int[] counts = countVowelsAndConsonants(input);
                int vowelCount = counts[0];
                int consonantCount = counts[1];

                // Print the results
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);
            }

            public static int[] countVowelsAndConsonants(String str) {
                int vowels = 0;
                int consonants = 0;

                // Iterate through each character in the string
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    // Check if the character is a letter
                    if (Character.isLetter(ch)) {
                        // Convert character to lowercase for easier comparison
                        char lowerCh = Character.toLowerCase(ch);

                        // Check if the character is a vowel
                        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    }
                }

                // Return counts as an array
                return new int[]{vowels, consonants};
            }
        }
        
