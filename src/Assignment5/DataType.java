 import java.util.Scanner;
public class DataType {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a large number (long):");

        long largevalue = sc .nextLong();
        byte smallvalue =(byte)largevalue;

        System.out.println("long Value:" +largevalue);
        System.out.println("After casting to byte:" +smallvalue);

        sc.close();

    }
}
