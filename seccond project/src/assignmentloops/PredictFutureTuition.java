package assignmentloops;

public class PredictFutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double initialTuition = 10000; // Initial tuition amount
        double tuition = initialTuition; // Current tuition amount
        double targetTuition = initialTuition * 2; // Double the initial tuition
        int years = 0; // Number of years

        // Calculate the number of years to double the tuition
        while (tuition < targetTuition) {
            tuition *= 1.07; // Increase tuition by 7% each year
            years++;
        }

        // Print the result
        System.out.println("It will take " + years + " years for the tuition to double.");
		
		

	}

}
