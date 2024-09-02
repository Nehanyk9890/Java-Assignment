public class EligibilityForAdmission {

        public static void main(String[] args) {
            int Physics = 65;
            int Chemistry = 51;
            int Mathematics = 72;
            int totalMarks = Physics + Chemistry + Mathematics;
            int totalMarksMathsAndPhysics =Mathematics + Physics;

            // Checking eligibility based on the criteria
            if (Mathematics >= 65 && Physics >= 55 && Chemistry >= 50) {
                if (totalMarks >= 190 || totalMarksMathsAndPhysics >= 140) {
                    System.out.println("The candidate is eligible for admission.");
                } else {
                    System.out.println("The candidate is not eligible for admission.");
                }
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
        
    }

}
