package javalab3;

import java.util.Scanner;

public class lab3part1 {

	public static void main(String[] args) {

		boolean game = true;
		int random;
		int answer;
		int input;
		int correct = 0;

		long t0 = System.currentTimeMillis();

		do {

			random = (int) (Math.random() * 12) + 1;
			answer = random * random;

			System.out.println("2 ^ " + random + "= ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();

			if (input == answer) {

				System.out.println("Correct!");
				correct++;

			} else {

				System.out.println("Incorrect! The correct answer was " + answer);
				System.out.println("Your score was: " + correct);
				System.out.println("Time: " + (System.currentTimeMillis() - t0));
				game = false;
			}

		} while (game);

	}

}
