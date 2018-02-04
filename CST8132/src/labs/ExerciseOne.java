package labs;

/**
 * The exercise one class is a simple class to display the use of for loops
 * and enhanced for loops to loops through an array of variables
 * 
 * @author Ben Scanlon
 * @since 2018-01-30
 */

public class ExerciseOne {

	private int[] myArray; //declare member variable myArray

	/**
	 * Constructor initializes the myArray variable with a new instance of an array, containing the numbers 1-10
	 */
	public ExerciseOne() {

		myArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	}
	
	/**
	 * Main class contains an instance of the ExcerciseOne class, and calls methods from the class
	 */
	
	public static void main(String[] args) {
		
		ExerciseOne displayWork = new ExerciseOne();
		displayWork.printArrayValues();
		displayWork.displayArrayProduct();
		
	}
	
	/**
	 * Private method that prints the variables contained in myArray, using a for loop to go through the array
	 * 
	 */

	private void printArrayValues() {

		System.out.print("myArray = {");
		for (int i = 0; i < myArray.length; i++) {

			System.out.print(myArray[i]);

			if (myArray[i] < myArray.length) { //stops extraneous commas from being added

				System.out.print(",");
			}
		}

		System.out.println("};");
	}
	
	/**
	 * Private method that displays the product of all the elements in the myArray array. Uses
	 * an enhanced for loop and a local variable to multiple the elements.
	 */

	private void displayArrayProduct() {

		int product = 1;

		for (int i : myArray) {

			product *= i;

		}

		System.out.println("The product of all the elements in myArray is: " + product);

	}

}
