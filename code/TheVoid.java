package code;

import java.util.Scanner;

public class TheVoid {
	Scanner x = new Scanner(System.in);

	public String openning() {
		System.out.println(
				"\nIn the times when there was no time and in the places where there was no place,\na young adventurer lost his way, on the way to find the ways to a secret little but precious little treasure...");
		System.out.println(
				"\n You fell asleep lone traveller, but now you are awake.\n Can you remember your name? \n [Enter your name] \n");
		return x.nextLine();
	}

	public void start(String name) {
		System.out.println("OK " + name
				+ " that's good... \n Better than last time...\n Now we have to move, you can not stand still for too much in this world.");
	}

	public String mover(int[] pos) {
		String direction;
		System.out.println("\nPick a direction to move... \n [Enter N(orth), S(outh) ,E(ast) or W(est)]");
		System.out.println("\nYour current location [" + String.valueOf(pos[0]) + "] [" + String.valueOf(pos[1]) + "]");

		do {
			direction = x.nextLine().toLowerCase();
			if (!(direction.equals("n")) && !(direction.equals("s")) &&!(direction.equals("w")) && !(direction.equals("e"))) {
				System.out.println("\n**Invalid direction please select from { N , S , E, W}**\n");
			}

		} while (!(direction.equals("n")) && !(direction.equals("s")) &&!(direction.equals("w")) && !(direction.equals("e")));

		return direction;
	}
}
