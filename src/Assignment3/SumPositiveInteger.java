public class SumPositiveInteger {
    public static void main(String[] args){
        int[] a = {5, 10, 15, 0, 20};
        int i = 0;
        int sum = 0;

        while (i < a.length) {
            int num = a[i];
            if (num== 0) {
                break;
            }
            if (num> 0) {
                sum += num;
            }
            i++;
        }

        System.out.println(" sum of positive integers is: " + sum);
    }
    }

