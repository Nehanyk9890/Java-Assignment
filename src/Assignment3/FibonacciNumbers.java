public class FibonacciNumbers {
    public static void main(String[] args){

                int count = 10;

                int a = 0;
                int b = 1;

                int i = 0;

                while (i < count) {
                    System.out.print(a + " ");

                    int next = a + b;
                    a = b;
                    b = next;

                    i++;
                }
            }
        }
