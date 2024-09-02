import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a positive integer.");

        int num = scanner.nextInt();

      int factorial=1;
      int i=num;
      while(i>0){
          factorial *=i;
          i--;
      }
        System.out.println("The factorial of " + num + " is " + factorial);
    }
}
