package mathemathics;

/*
 * By Ian Angillis, 2018
 * 
 * Math class for basically everything that has to do with mathematics, this includes:
 * Functions for basic calculations
 */

public class Math {

	// Variables
	public static final double PI = 3.1415;
	public static final double E = 2.17;

	// Basisoperaties
	public static int sum(int number) {
		return number;
	}

	public static double sum(double number) {
		return number;
	}

	public static int sum(int... numbers) {

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		return sum;
	}

	public static double sum(double... numbers) {

		double sum = 0;

		for (double number : numbers) {
			sum += number;
		}

		return sum;
	}

	public static int difference(int number) {
		return number;
	}

	public static double difference(double number) {
		return number;
	}

	public static int difference(int... numbers) {

		int sum = 0;

		for (int number : numbers) {
			sum -= number;
		}

		return sum;
	}

	public static double difference(double... numbers) {

		double sum = 0;

		for (double number : numbers) {
			sum -= number;
		}

		return sum;
	}

	public static int exponent(int x, int y) {

		int product = x;

		for (int i = 0; i < (y-1); i++) {
			product *= x;
		}

		return product;
	}

	public static double exponent(double x, double y) {
		double product = x;

		for (int i = 0; i < (y-1); i++) {
			product *= x;
		}

		return product;
	}

	public static int multiply(int... numbers) {

		int product = 1;

		for (int number : numbers) {
			product *= number;
		}

		return product;
	}

	public static double multiply(double... numbers) {

		double product = 1;

		for (double number : numbers) {
			product *= number;
		}

		return product;
	}

	// Matrices
	public static int[][] addMatrices(int [][] matrix1, int [][] matrix2){
		
		if(boundariesAreOkForMatrixAddition(matrix1, matrix2)) {
			
		}
	
	}
	
	private static boolean boundariesAreOkForMatrixAdditionOrDifference(int [][] matrix1, int [][] matrix2) {
		
	}

}
