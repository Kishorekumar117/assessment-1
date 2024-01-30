package com.java;

public class Extras {

	static int factorial(int n) {
		if (n != 0) { // termination condition
			return n * factorial(n - 1); // recursive call
		} else {
			return 1;
		}
	}

	static boolean prime(int n, int start) {
		if (n <= 2) {
			return (n == 2);
		}
		if (n % start == 0) {
			return false;
		}
		if (start * start > n) {
			return true;
		}
		return prime(n, start + 1);
	}

	public static void main(String[] args) {
		int number = 5;
		System.out.println("factorial of " + number + " is => " + factorial(number));

		int check = 5;
		System.out.println("the number " + check + " is prime => " + prime(check, 2));
	}
}
