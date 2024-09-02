public class largestnumber {

    public static void main(String[] args) {

        int num1 = 52;
        int num2 = 05;
        int num3 = 12;

        System.out.println("1st Number = " + num1 + ",");
        System.out.println("2nd Number = " + num2 + ",");
        System.out.println("3rd Number = " + num3 + ",");

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The 1st Number is the greatest among three");
            System.out.println("1st Number = " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The 2nd Number is the greatest among three");
            System.out.println("2nd Number = " + num2);
        } else {
            System.out.println("The 3rd Number is the greatest among three");
            System.out.println("3rd Number = " + num3);
        }
    }
}


