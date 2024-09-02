public class valueofMbasedonM {

        public static void main(String[] args) {
            // Directly initializing the value of m
            int m = -5;
            int n;

            // Determine the value of n based on the value of m
            if (m > 0) {
                n = 1;
            } else if (m == 0) {
                n = 0;
            } else {
                n = -1;
            }

            // Display the value of n
            System.out.println("The value of n = " + n);
        }
    }
