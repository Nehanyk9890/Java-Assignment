public class EqualString {
    public static void main(String[] args) {

        String string1 = "hello";
        String string2 = "world";

        boolean areEqual = string1.equals(string2);


        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}


