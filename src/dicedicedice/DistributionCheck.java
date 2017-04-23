package dicedicedice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
/*
* Console client for running multiple instances of damage calculation, storing results in distribution.txt
*/
public class DistributionCheck {
	private static Scanner reader;
	private static Writer wr;

	public static void main(String[] args) throws IOException {
		String formula = getFormula();
		int n = getAccuracy();
		compute(formula, n);
	}

	/*
	 * Prompts user for damage formula via console and returns the result
	 */
	public static String getFormula() {
		reader = new Scanner(System.in);
		System.out.println("Enter damage calculation: ");
		String str = reader.nextLine();
		return str;
	}

	/*
	 * Prompts user for the number of time they want to run their damage formula, to check the distribution/speed of their calc
	 */
	public static int getAccuracy() {
		reader = new Scanner(System.in);
		System.out.println("How many times do you want to compute calculation?");
		int n = reader.nextInt();
		return n;
	}
	
	/*
	 * Writes the results into a txt file
	 */
	public static void compute(String str, int n) throws IOException {
		wr = new FileWriter("distribution.txt");
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			int result = Damage.dmg(str);
			wr.write(Integer.toString(result) + " ");
		}
		long endTime = System.currentTimeMillis();
		wr.close();
		long time = endTime-startTime;
		System.out.println("Computation time: " + time +"ms");
	}

}
