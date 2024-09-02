import java.util.HashSet;

public class DuplicateInput {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 9, 12, 5, 7, 8};

        HashSet<Integer> numberSet = new HashSet<>();

        int index = 0;

        while (index < numbers.length) {
            int number = numbers[index];


            if (numberSet.contains(number)) {

                System.out.println("Duplicate number detected: " + number);
                break;
            } else {

                numberSet.add(number);
            }
            index++;
        }

        if (index == numbers.length) {
            System.out.println("No duplicates found.");
        }
    }
}
