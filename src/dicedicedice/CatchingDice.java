/*
 * This parses a string for (number)d(number) and returns the string with dice rolls replaced with their outcomes..
 */

package dicedicedice;

import java.util.concurrent.ThreadLocalRandom;

public class CatchingDice {

	/*
	 * Method that rolls dice for you
	 * 
	 * @param dice: the number of dice you are rolling
	 * 
	 * @param sides: the number of sides of the dice
	 */
	public static String roll(int dice, int sides) {
		int total = 0;
		int roll = 0;
		for (int i = 0; i < dice; i++) {
			roll = ThreadLocalRandom.current().nextInt(1, sides + 1);
			System.out.println("You rolled a: " + roll + "!");
			total = total + roll;

		}
		return Integer.toString(total);
	}

	/*
	 * Computes dice rolls contained a string. e.g. diceParse("3+1d12+4") will
	 * return 3+(random number 1-12)+4
	 */
	public static String diceParse(String str) {
		String front = new String();
		String back = new String();
		int dice = 0;
		int sides = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'd') {
				if (str.length() == 1) {
					return "0";
				}

				// Cuts string into two parts at the first d (from left to
				// right)
				front = str.substring(0, i);
				back = str.substring(i + 1);

				/*
				 * Trims first and second half of string to catch the number of
				 */

				// Selects dice from other operators
				for (int q = 1; q <= front.length(); q++) {
					if (!Character.isDigit(front.charAt(front.length() - q))
							&& front.charAt(front.length() - q) != ' ') {
						dice = Integer.parseInt(front.substring(front.length() - q + 1));
						front = front.substring(0, front.length() - q + 1);
						break;
					}
				}
				for (int r = 0; r < back.length(); r++) {
					if (!Character.isDigit(back.charAt(r)) && back.charAt(r) != ' ') {
						sides = Integer.parseInt(back.substring(0, r));
						back = back.substring(r);
						break;
					}
				}
				if (dice == 0 && front != "") {
					dice = Integer.parseInt(front);
					front = "";
				}
				if (sides == 0 && back != "") {
					sides = Integer.parseInt(back);
					back = "";
				}

				String middle = roll(dice, sides);
				str = front + middle + back;
				System.out.println("Your total roll is: " + middle + "!");
			}
		}
		return str;
	}

}
