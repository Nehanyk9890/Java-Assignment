import java.util.*;
public class SumOfDigits {
    public static int SumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n % 10 + SumOfDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print( "Enter any integrs:");
        int num = sc . nextInt();

        num = Math.abs(num);

        int result = SumOfDigits(num);
        System.out.println("The sum of interger is:" + result );
    }

}
