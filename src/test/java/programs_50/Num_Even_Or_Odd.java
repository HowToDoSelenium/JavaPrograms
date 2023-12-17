package programs_50;

import java.util.Scanner;

public class Num_Even_Or_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find Even or Odd:");
		long a = s.nextLong();
		if (a % 2 == 0) {
			System.out.println("Entered number " + a + " is even.");

		} else {
			System.out.println("Entered number " + a + " is odd.");
		}
		s.close();
	}
}