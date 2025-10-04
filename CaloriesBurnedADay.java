import java.util.Scanner ;

public class CaloriesBurnedADay {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); // scanner to get an input from the user
		
		double ageYears = scnr.nextDouble();// input to get the user's age. Double was chosen to be considered by the printf method, would not work for an integer.
		double weightPounds = scnr.nextDouble(); // input to get the user weight in pounds.
		double heartBPM = scnr.nextDouble(); // input to get the user's heart rate in beats per minute.
		double timeMinutes = scnr.nextDouble(); // input to get the user's time in minutes
		
		double averageCaloriesBurned = ((ageYears * 0.2757) + (weightPounds * 0.03295) + (heartBPM * 1.0781) - 75.4991) * timeMinutes / 8.368; // Calculation of the average calories burned for a person.
		 
		System.out.printf("Calories: %.2f calories\n", averageCaloriesBurned);
		
		/* OUTPUT CONSOLE
Calories: Calories: averageCaloriesBurned result from scanner. 
		 */
	}
}