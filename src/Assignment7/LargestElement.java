import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);

        System.out.print("Enter the size of the array:");

        int size =sc.nextInt();

        int[] array =new int[size];

        System.out.println("Enter" + size + "elements:");
        for(int i=1 ;i<size; i++){
            array[i] =sc .nextInt();
        }
        int largest = array[0];

        for(int i=1; i<size;i++){
            if(array[i] >largest){
                largest = array[i];
            }
        }
        System.out.println("The largest elementin the array is:" + largest);

    }
}
