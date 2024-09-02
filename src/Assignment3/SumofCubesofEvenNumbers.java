public class SumofCubesofEvenNumbers {
            public static void main(String[] args) {
                int i= 20;

                int sumOfCubes = 0;
                int currentNumber = 2;


                while (currentNumber <= i) {

                    int cube = currentNumber * currentNumber * currentNumber;


                    sumOfCubes += cube;

                    currentNumber += 2;
                }

                // Print the result
                System.out.println("The sum of the cubes of even numbers up to " +i+ " is " + sumOfCubes);
            }
        }


