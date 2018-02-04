package labs;

/**
 * ExerciseTwo is a class used to demonstrate the use of 
 * enhanced for loops with 2-dimensional arrays
 * @author Ben Scanlon
 * @since 2018-01-30
 *
 */

public class ExerciseTwo {

	private int[][] myTwoDArray; // declare the 2-dimensional array variable
	
	/**
	 * The constructor initializes the 2 dimensional array containing 8 arrays of 10 elements each
	 */

	public ExerciseTwo() {

		myTwoDArray = new int[8][10];

		for (int i = 0; i < myTwoDArray.length; i++) {

			for (int j = 0; j < myTwoDArray[i].length; j++) {

				myTwoDArray[i][j] = (i * 10) + j;

			}

		}
	}
	
	/**
	 * The main method instantiates the ExerciseTwo class and calls its methods
	 */

	public static void main(String[] args) {

		ExerciseTwo displayWork = new ExerciseTwo();
		
		displayWork.printArrayValues();
		
		displayWork.displayArraySumOfAverages();
	}
	
	/**
	 * Print the elements of the two dimensional array, formatted by individual array
	 */

	private void printArrayValues() {

		System.out.println("myTwoDArray = {");
		
		for (int i = 0; i < myTwoDArray.length; i++) {
			
			System.out.print("     {");

			for (int j = 0; j < myTwoDArray[i].length; j++) {
				
				System.out.print(myTwoDArray[i][j]);

				if (j < myTwoDArray[i].length - 1) { // stops extraneous commas from being added

					System.out.print(",");
				}
			}
			System.out.print("}");
			
			if (i < myTwoDArray.length - 1) { // stops extraneous commas from being added
				
				System.out.print(",");
			}
			System.out.println();
		}

		System.out.println("};");

	}
	
	/**
	 * Sums all the elements in an array and returns the average
	 * 
	 * @param takes an integer array as a parameter, specifically for the individual arrays within the 2
	 * dimensional array, myTwoDArray
	 * @return returns the average of all the elements in the array
	 */

	private static double getArrayAverage(int[] a) {

		double sum = 0;

		for (int i : a) {

			sum += i;
		}

		double average = sum / (a.length);

		return average;
	}
	
	/**
	 * Gets all the averages for the individual arrays in myTwoDArray, and then prints the sum
	 */

	private void displayArraySumOfAverages() {

		double arraySum = 0;

		for (int i[] : myTwoDArray) {

			arraySum += getArrayAverage(i);

		}

		System.out.println("The sum of the average values of each array is " + arraySum);

	}

}
