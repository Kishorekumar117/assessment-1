package com.java;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter '1' for Length\nClick '2' for Area\nClick '3' for Temperature : ");
		

		int click = input.nextInt();

		float result;

		if (click==1) {

			System.out.println(" Enter\n '1' for Inch to meter\n '2' meter to inch : ");

			int num1 = input.nextInt();

			if (num1 == 1) {

				System.out.println("Enter Inch value : ");

				float inch = input.nextFloat();

				result = (float) (inch / 39.37);
				
				int number=(int)Math.floor(result);
				int dec=(int) ((result%1)*1000);
				System.out.println(number + " meters "+dec+" cm");

			}

			else if (num1 == 2) {

				System.out.println("Enter Meter Value : ");

				float meters = input.nextFloat();

				result = (float) (meters * 39.37);
				
				int number=(int)Math.floor(result);
				int dec=(int) ((result%1)*1000);
				System.out.println(number + " meters "+dec+" cm");

			}

		}

		else if (click==2) {


			System.out.println(" Enter\n '1' for foot to sqaremeter \n '2' squaremeter to foot");

			int num1 = input.nextInt();

			if (num1 == 1) {

				System.out.println(" enter value for foot : ");

				float foot = input.nextFloat();

				result = (float) (foot / 10.764);

				System.out.println(result + " squaremeters");

			}

			else if (num1 == 2) {

				System.out.println(" enter the squaremeters :");

				float squaremeters = input.nextFloat();

				result = (float) (squaremeters * 10.764);

				System.out.println(result + " foots");

			}

		}

		else if (click==3) {

			System.out.println("Enter'1' celcius to foregnheit or \n '2'foregnheit to celcius : ");

			int num1 = input.nextInt();

			if (num1 == 1) {

				System.out.println(" enter the celcius :");

				float celcius = input.nextFloat();

				result = (float) ((celcius * 9 / 5) + 32);

				System.out.println(result + " foregnheit");

			}

			else if (num1 == 2) {

				System.out.println(" enter the foregnheit :");

				float foregnheit = input.nextFloat();

				result = (float) ((foregnheit - 32) * 5 / 9);

				System.out.println(result + " celcius");

			}

		}

	}
}
