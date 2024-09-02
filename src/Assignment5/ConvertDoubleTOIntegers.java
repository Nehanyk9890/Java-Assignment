import java.util.Scanner;

public class ConvertDoubleTOIntegers {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

    System.out.print("Enter a decimal number:");
    double decimalNumber = scanner.nextDouble();

    int integerNumber = (int) decimalNumber;

    System.out.println("Integer value is:" + integerNumber);

    scanner.close();
    }
}
