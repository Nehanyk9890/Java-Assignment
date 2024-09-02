import java.util.HashMap;
import java.util.Map;

public class CharacterInString {
        public static void main(String[] args) {
            // Define the string directly
            String input = "example string with repeated characters";

            // Create a HashMap to store character frequencies
            HashMap<Character, Integer> frequencyMap = new HashMap<>();

            // Iterate through each character in the string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // If the character is already in the map, update its frequency
                if (frequencyMap.containsKey(ch)) {
                    frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                } else {
                    // If the character is not in the map, add it with frequency 1
                    frequencyMap.put(ch, 1);
                }
            }

            // Display the frequency of each character
            System.out.println("Character frequencies:");
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

