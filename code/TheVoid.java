package code;

import java.util.Scanner;

public class TheVoid {
	Scanner x = new Scanner(System.in);
	boolean replay;

	public String openning() {
		System.out.printf("%-15s",
				"\nIn the times when there was no time and in the places where there was no place,\na young adventurer lost his way, on the way to find the ways to a secret little but precious little treasure...");
		System.out.println(
				"\nYou fell asleep lone traveller, but now you are awake.\n\nCan you remember your name? \n[Enter your name] \n");
		return x.nextLine();
	}

	public void start(String name) {
		System.out.println("\nNice " + name
				+ " that's good... \nBetter than the last time...\nNow we have to move, you can not stand still for too ong in this world.");
		System.out.println(
				"\nIn case you have forgotten again...\nThe watch like compass on your arm shows the distance to your quest treasure\nUse it wisely to find your way to it... ");
	}

	public String mover(int[] pos) {
		String direction;
		System.out.println("\nPick a direction to move... \n[Enter [n]orth, [s]outh) ,[e]ast or [w]est]");
		System.out.println("\nYour current location [" + String.valueOf(pos[0]) + "] [" + String.valueOf(pos[1]) + "]");

		do {
			direction = x.nextLine().toLowerCase();
			if (!(direction.equals("n")) && !(direction.equals("s")) && !(direction.equals("w"))
					&& !(direction.equals("e"))) {
				System.out.println("\n**Invalid direction please select from { n , s , e, w}**\n");
			}

		} while (!(direction.equals("n")) && !(direction.equals("s")) && !(direction.equals("w"))
				&& !(direction.equals("e")));

		return direction;
	}

	public void askReplay(String name) {
		String replayAns;
		System.out.println("\nFor insant re-awakening enter [y] now...\nTo stay in the void for some time enter [n]");
		do {
			replayAns = x.nextLine().toLowerCase();
			if (replayAns.equals("n")) {
				replay = false;
				break;
			} 
			else if(replayAns.equals("y")){
				replay=true;
				break;
			}
			else if (!replayAns.equals("y") && !replayAns.equals("n")) {
				System.out
						.println("\nTake some time " + name + "... You need to enter [y] or [n] to declare your will");
			}
		} while (!replayAns.equals("y") && !replayAns.equals("n"));

	}
}
