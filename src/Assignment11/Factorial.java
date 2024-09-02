import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter any positive integers:");
          int num=sc.nextInt();

          if(num<0){
              System.out.println("Please enter a integers:");
          }else{
              int result = fact(num);
              System.out.println("Factorial of" + num + "is:" + result);
          }

    }

}
