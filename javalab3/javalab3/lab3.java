package javalab3;

public class lab3 {

	public static void main(String[] args) {

		long t0 = System.currentTimeMillis();
		long countControl = 0;
		long countPow = 0;
		long countCube = 0;
		double x = 0;

		while (System.currentTimeMillis() < t0 + 1000) {
			
			x = Math.random() * 5 + 1;
			
			long tmp = (long)x;

			countControl++;

		}
		t0 = System.currentTimeMillis();
		while (System.currentTimeMillis() < t0 + 1000) {

			x = Math.random() * 5 + 1;

			long pow = (long) Math.pow(x, 3);
			countPow++;

		}
		t0 = System.currentTimeMillis();
		while (System.currentTimeMillis() < t0 + 1000) {

			x = Math.random() * 5 + 1;
			long cube = (long) cube(x);
			countCube++;

		}
		System.out.println("Control 1 second test: ");
		System.out.println(countControl);
		System.out.println("--------------------------");
		System.out.println("MathPow 1 second test");
		System.out.println(countPow);
		System.out.println("--------------------------");
		System.out.println("Cubed Function 1 second test");
		System.out.println(countCube);
		System.out.println("--------------------------");

	}

	public static double cube(double a) {
		double cubed = a * a * a;
		return cubed;
	}

}
