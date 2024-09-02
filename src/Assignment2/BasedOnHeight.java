public class BasedOnHeight {
    public static void main(String[] args){
        int height = 185;

        // Categorizing the person based on height
        if (height < 150) {
            System.out.println("The person is Dwarf.");
        } else if (height >= 150 && height <= 165) {
            System.out.println("The person has Average height.");
        } else {
            System.out.println("The person is Tall.");
        }
    }
}


