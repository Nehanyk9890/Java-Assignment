import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.print("Enter Operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);

        double result =0 ;
        //Switch statement

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! division by zero not allowed:");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator:");
        }
        System.out.println("The result is:" + result);

    }
}
