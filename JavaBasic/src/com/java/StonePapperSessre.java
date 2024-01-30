package com.java;

import java.util.Scanner;

public class StonePapperSessre {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int play1 = 0;
		int play2 = 0;
		int dra = 0;
		String[] round = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
				"tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth",
				"eighteenth", "nineteenth", "twentieth" };
		int times = 0;
		System.out.println("First round : ");
		for (int i = 1; i <= 2; i++) {

			System.out.print("Player 1, enter your choice (1 for paper, 2 for rock, 3 for scissors): ");
			int player1 = input.nextInt();

			if (player1 > 4) {
				System.out.println();
				System.out.println("Enter the correct choice");
				i = 1;
				continue;
			}

			System.out.print("Player 2, enter your choice (1 for paper, 2 for rock, 3 for scissors): ");
			int player2 = input.nextInt();

			if (player2 > 4) {
				System.out.println();
				System.out.println("Enter the correct choice");
				i = 1;
				continue;
			}

			if (player1 == player2) {

				System.out.println();
				System.out.println(round[times] + " round TIE so please continue");
				times++;
				dra++;
				i = 1;
				continue;
			} else if ((player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 3)
					|| (player1 == 3 && player2 == 1)) {
				play1++;
				times++;
			} else {
				play2++;
				times++;
			}

			System.out.println();
			System.out.print("Click '1' for " + round[times] + " round : ");
			int user = input.nextInt();
			if (1 == user) {
				i = 1;
			} else {
				break;
			}
		}
		System.out.println();
		System.out.println("Player 1 wins for " + play1 + " times");
		System.out.println("Player 2 wins for " + play2 + " times");
		System.out.println("Draw for " + dra + " times");

	}
}
