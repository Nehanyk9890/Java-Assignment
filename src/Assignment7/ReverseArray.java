import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size =sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter" + size + "integers:");
        for(int i=1 ;i<size; i++){
            array[i] =sc .nextInt();
        }
        for(int i=0; i<size /2; i++){
            int temp =array[i];
            array[i] = array[size - 1 -i];
            array[size - 1 - i]=temp;

            System.out.println("Reversed array:");
            for(int a = 0; a < size ; a++){
                System.out.println(array[a] + "");

            }
        }
    }
}
