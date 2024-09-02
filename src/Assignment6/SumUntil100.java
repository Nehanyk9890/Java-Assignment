import java.util.Scanner;
public class SumUntil100 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("Enter a number:");
            int num =sc.nextInt();
            sum +=num;

            if(sum>=100){
                break;
            }
        }
        System.out.println("The total sum is:" + sum);
        sc.close();
    }

}
