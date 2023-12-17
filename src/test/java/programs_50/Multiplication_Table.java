package programs_50;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner data = new Scanner(System.in);
		System.out.println("Enter Table no: ");
		int nextInt = data.nextInt();
		System.out.println("Table Upto : ");
		int nextInt2 = data.nextInt();

		for (int i = 1; i <= nextInt2; i++) {
			int tot = nextInt * i;
			System.out.println(nextInt + " * " + i + " = " + tot);
		}
	}
}
